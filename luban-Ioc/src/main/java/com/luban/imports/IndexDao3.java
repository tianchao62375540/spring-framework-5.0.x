package com.luban.imports;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: tianchao
 * @Date: 2019/12/8 21:56
 * @Description:
 */
public class IndexDao3 implements BeanPostProcessor {

	/*public void  query(){
		System.out.println("indexDao3");
	}*/

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			return Proxy.newProxyInstance(bean.getClass().getClassLoader(),new Class[]{IDao.class},new ImportInvocationhandler(bean));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}


}

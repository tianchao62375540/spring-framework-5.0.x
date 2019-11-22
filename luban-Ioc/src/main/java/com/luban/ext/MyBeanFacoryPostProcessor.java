package com.luban.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Auther: tianchao
 * @Date: 2019/11/22 22:22
 * @Description:
 */
@Component
public class MyBeanFacoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition indexDao = beanFactory.getBeanDefinition("indexDao");
		indexDao.setScope("prototype");
	}
}

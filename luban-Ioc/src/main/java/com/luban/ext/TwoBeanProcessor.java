package com.luban.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @Auther: tianchao
 * @Date: 2019/11/18 23:41
 * @Description:
 */
//@Component
public class TwoBeanProcessor implements BeanPostProcessor, PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("TwoBeanProcessor before: "+bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("TwoBeanProcessor after: "+bean);
		return bean;
	}

	@Override
	public int getOrder() {
		return 99;
	}
}

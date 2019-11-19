package com.luban.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @Auther: tianchao
 * @Date: 2019/11/17 20:21
 * @Description:
 */
@Repository
public class IndexDao implements ApplicationContextAware {
	ApplicationContext applicationContext;
	public IndexDao(){
		System.out.println("构造方法");
	}
	@PostConstruct
	public void init(){
		System.out.println("init...");
	}

	public void query(){
		System.out.println("IndexDao query()...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext");
		this.applicationContext = applicationContext;
	}
}

package com.luban.test;

import com.luban.app.AppConfig;
import com.luban.dao.IndexDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: tianchao
 * @Date: 2019/11/17 20:22
 * @Description:
 */
public class TestAll {
	public static void main(String[] args) {
		//把spring所有的前提环境准备
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao bean = context.getBean(IndexDao.class);
		bean.query();
	}
	@Test
	public void testRefresh(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		IndexDao bean = context.getBean(IndexDao.class);
		bean.query();
	}
	@Test
	public void test(){
		//把spring所有的前提环境准备
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(IndexDao.class);
		context.refresh();
		IndexDao bean = context.getBean(IndexDao.class);
		bean.query();
	}
	@Test
	public void testProcessor(){
		//把spring所有的前提环境准备
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//context.register(IndexDao.class);
		//context.refresh();
		IndexDao bean = context.getBean(IndexDao.class);
		bean.query();
	}

}

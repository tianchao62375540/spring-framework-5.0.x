package com.luban.test;

import com.luban.app.AppConfig;
import com.luban.dao.IndexDao;
import com.luban.ext.MyBeanFacoryPostProcessor;
import com.luban.imports.IDao;
import com.luban.imports.IndexDao3;
import com.luban.imports2.Appconfig2;
import com.luban.imports2.IndexService;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
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
		//称之为自定义的BeanFactoryPostProcessor 没有被spring容器管理
		//context.addBeanFactoryPostProcessor(MyBeanFacoryPostProcessor.class);
		IndexDao bean = context.getBean(IndexDao.class);
		IndexDao bean1 = context.getBean(IndexDao.class);
		System.out.println(bean+"   "+bean1);
		bean.query();
	}

	@Test
	public void testImport_SelectImport(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.luban.imports.AppConfig.class);
		IDao bean = (IDao)context.getBean("indexDao");
		bean.query();
		String[] singletonNames = context.getDefaultListableBeanFactory().getSingletonNames();
		System.out.println("==============================================");
		for (String singletonName : singletonNames) {
			System.out.println(singletonName);
		}
	}
	@Test
	public void testImport_SelectImport22(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig2.class);
		IndexService bean = (IndexService)context.getBean("com.luban.imports2.IndexService");
		String[] beanNamesForType = context.getBeanNamesForType(IndexService.class);
		for (String s : beanNamesForType) {
			System.out.println(s);
		}
		String[] singletonNames = context.getDefaultListableBeanFactory().getSingletonNames();
		System.out.println("==============================================");
		for (String singletonName : singletonNames) {
			System.out.println(singletonName);
		}

		System.out.println(bean);
	}

}

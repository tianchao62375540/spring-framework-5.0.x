package com.luban.imports;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Set;

/**
 * @Auther: tianchao
 * @Date: 2019/12/8 21:56
 * @Description:
 */
public class MySelector implements ImportSelector, BeanFactoryAware {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//StandardAnnotationMetadata standardAnnotationMetadata = (StandardAnnotationMetadata) importingClassMetadata;
		//standardAnnotationMetadata.get
		return new String[]{IndexDao3.class.getName()};
	}

	/**
	 * Callback that supplies the owning factory to a bean instance.
	 * <p>Invoked after the population of normal bean properties
	 * but before an initialization callback such as
	 * {@link InitializingBean#afterPropertiesSet()} or a custom init-method.
	 *
	 * @param beanFactory owning BeanFactory (never {@code null}).
	 *                    The bean can immediately call methods on the factory.
	 * @throws BeansException in case of initialization errors
	 * @see BeanInitializationException
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory);
	}
}

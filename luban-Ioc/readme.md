//实例化一个bean工厂
org.springframework.context.support.GenericApplicationContext#GenericApplicationContext()
    1实例化new AnnotatedBeanDefinitionReader(this);
    委托给AnnotationConfigUtils
        1添加AnnotationAwareOrderComparator类的对象，主要去排序
        2添加ContextAnnotationAutowireCandidateResolver对象，去延迟加载
        3添加ConfigurationClassPostProcessor 
        why:因为在invokeBeanFactoryPostProcessors(beanFactory)---->PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(beanFactory, getBeanFactoryPostProcessors());
        方法中做一些事情，委托了多个实现了BeanDefinitionRegistryPostProcessor或BeanFactoryPostProcessor接口的类来做这件事情
        internalConfigurationAnnotationProcessor就是 实现了BeanDefinitionRegistryPostProcessor的类
        org.springframework.context.annotation.internalConfigurationAnnotationProcessor
        4RequiredAnnotationBeanPostProcessor
        ....
        org.springframework.context.annotation.AnnotationConfigUtils#registerAnnotationConfigProcessors(this.registry)
            //往beanDefinitionMap中注册
            org.springframework.context.annotation.AnnotationConfigUtils.registerPostProcessor
    2实例化new ClassPathBeanDefinitionScanner(this); 能够扫描我们的对象，能够扫描一个类，转换为bd
    3register(annotatedClasses);
    4refresh()
        //准备工作包括设置启动时间，是否激活标示位，初始化属性源（property,source）配置
        prepareBeanFactory(beanFactory);
            //拿出bean工厂
            ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();
            //准备bean工厂
            //添加bean的表达式解析，为了能够让beanfactory去解析bean表达式
            //添加了被自动注入忽略的列表ignoredDependencyInterfaces
            //能够在bean中获得各种*Aware(*Aware都有其作用)
            //beanFactory.addBeanPostProcessor(new ApplicationContextAwareProcessor(this));
            org.springframework.context.support.AbstractApplicationContext.prepareBeanFactory（beanFactory）
        //
        invokeBeanFactoryPostProcessors(beanFactory);
            
            
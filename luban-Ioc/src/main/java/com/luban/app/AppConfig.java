package com.luban.app;

import com.luban.imports.MySelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Auther: tianchao
 * @Date: 2019/11/17 20:21
 * @Description:
 */
@Configuration
@ComponentScan("com.luban")
//@Import(MySelector.class)
public class AppConfig {
}

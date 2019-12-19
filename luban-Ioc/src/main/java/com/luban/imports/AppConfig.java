package com.luban.imports;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Auther: tianchao
 * @Date: 2019/11/17 20:21
 * @Description:
 */
@Configuration
@EnableLuban
@ComponentScan(basePackages={"com.luban.imports"})
public class AppConfig {
}

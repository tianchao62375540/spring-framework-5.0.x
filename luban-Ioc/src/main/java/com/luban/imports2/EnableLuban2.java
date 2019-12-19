package com.luban.imports2;

import com.luban.imports.MySelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Auther: tianchao
 * @Date: 2019/12/8 22:01
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(TwoSelector.class)
public @interface EnableLuban2 {
}

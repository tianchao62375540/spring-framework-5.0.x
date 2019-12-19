package com.luban.imports2;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Auther: tianchao
 * @Date: 2019/12/8 23:02
 * @Description:
 */
public class TwoSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexService.class.getName()};
	}
}

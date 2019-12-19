package com.luban.imports;

import org.springframework.stereotype.Component;

/**
 * @Auther: tianchao
 * @Date: 2019/12/8 22:32
 * @Description:
 */
@Component
public class IndexDao implements IDao {
	@Override
	public void query() {
		System.out.println("query indexDao");
	}
}

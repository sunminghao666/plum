/********************************************************
* <p>Description: 测试_service实现层</p>
* <p>Project: OrderApiServiceImpl.java </p>
* <p>Date: 2018-03-01 11:21:00 </p>
* <p>Author: OrderApiService </p>
* <p>Comment : </p>
*
*********************************************************/
package com.plum.manager.service.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plum.manager.dao.TestDao;
import com.plum.manager.service.TestService;

@Service(value = "TestService")
public class TestServiceImpl implements TestService {

	@Autowired
	TestDao testDao;

	/**
	 * 
	 * 测试
	 * 
	 * @param
	 * @since 2018-03-01 下午11:23:00
	 * @author SunMinghao
	 * @return
	 */
   @Override
   public String test() {

		// 返回报文
		String resp = "";

		try {

			resp = testDao.searchTest();
			System.out.println(resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
   }

}

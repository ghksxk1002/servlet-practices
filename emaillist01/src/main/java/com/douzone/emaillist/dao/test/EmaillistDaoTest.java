package com.douzone.emaillist.dao.test;

import java.util.List;

import com.douzone.emaillist.vo.EmaillistVo;
import com.douzone.emillist.dao.EmaillistDao;


public class EmaillistDaoTest {

	public static void main(String[] args) {
		//insertTest();
		findAllTest();
		
	}

	private static void findAllTest() {
		List<EmaillistVo> list = new EmaillistDao().findAll();
		for (EmaillistVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		EmaillistVo vo = null;
		EmaillistDao dao = new EmaillistDao();

		vo = new EmaillistVo();
		vo.setFirstName("에");
		vo.setLastName("에링");
		vo.setEmail("더존@가랭");
		dao.insert(vo);

	

	}

}

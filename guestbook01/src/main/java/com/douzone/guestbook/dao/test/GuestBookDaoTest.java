package com.douzone.guestbook.dao.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;

public class GuestBookDaoTest {
	public static void main(String[] args) {
		//insertTest();
		findAllTest();
		delete(6L, "1234");

	}

	private static Boolean delete(long no, String password) {
		new GuestBookDao().delete(no, password);
		return null;
	}

	private static void findAllTest() {
		List<GuestBookVo> list = new GuestBookDao().findAll();
		for (GuestBookVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		GuestBookVo vo = null;
		GuestBookDao dao = new GuestBookDao();

		vo = new GuestBookVo();
		vo.setName("이승현");
		vo.setPassword("1234");
		vo.setText("안녕하세요");
		dao.insert(vo);

	

	}
}

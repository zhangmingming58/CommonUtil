package com.baidu.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.junit.Test;

import com.baidu.common.bean.Person;

public class RandomChineseUtilTest {

	@Test
	public void testIsStringEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsStringEmptyWithSpace() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetChineseInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetChineseName() {
		for (int i = 0; i < 100; i++) {
			System.out.print(RandomChineseUtil.getChineseName() + ",");
		}
	}

	@Test
	public void testGetChinese() throws UnsupportedEncodingException {
		for (int i = 0; i < 100; i++) {
			System.out.print(RandomChineseUtil.getChinese() + ",");
		}
	}

	@Test
	public void test1() {
		for (int i = 0; i < 10000; i++) {
			Person person = new Person(i, RandomChineseUtil.getChineseName(), RandomNumUtil.getRandomNum(0, 120),
					new Date());
			System.out.println(person);
		}
	}

}

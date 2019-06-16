package com.baidu.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomNumUtilTest {

	@Test
	public void testGetRandomNumIntInt() {
		for (int i = 0; i < 10; i++) {
			System.out.print(RandomNumUtil.getRandomNum(0, 10)+",");
		};
	}

	@Test
	public void testGetRandomNumIntIntInt() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomNumUtil.getRandomNum(0, 50,11));
		};
	}

	@Test
	public void testGetRandomString() {
		for (int i = 0; i < 10; i++) {
			System.out.print(RandomNumUtil.getRandomString()+",");
		};
	}

	@Test
	public void testGetRandomStringInt() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomNumUtil.getRandomString(6));
		};
	}

}

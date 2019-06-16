package com.baidu.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomNumUtil
 * @Description: ：①获取最小最大区间的随机数；②获取最 小最大区间多个不重复随机数；③获取 1个 1-9,a-Z之间的随机字符；④
 *               返回参数指定个数的随机字符串(应用场景如：验证码)。
 * @author: ZK
 * @date: 2019年6月16日 下午6:49:46
 */
public class RandomNumUtil {
	/**
	 * 
	 * @Title: getRandomNum
	 * @Description: ①获取最小最大区间的随机数
	 * @param min 区间最小值
	 * @param max 区间最大值
	 * @return
	 * @return: int
	 */
	public static int getRandomNum(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	/**
	 * @Title: getRandomNum
	 * @Description:②获取最 小最大区间多个不重复随机数
	 * @param min
	 * @param max
	 * @param num
	 * @return
	 * @return: Set<Integer>
	 */
	public static Set<Integer> getRandomNum(int min, int max, int num) {
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != num) {
			set.add(getRandomNum(min, max));
		}
		return set;
	}
	
	public static String getRandomString() {
		String string = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		int index = getRandomNum(0, string.length()-1);
		char c = string.charAt(index);
		return c+"";
	}
	
	public static String getRandomString(int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			String string = getRandomString();
			sb.append(string);
		}
		return sb.toString();
	}
}

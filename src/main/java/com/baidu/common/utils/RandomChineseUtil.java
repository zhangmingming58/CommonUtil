package com.baidu.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * 
 * @ClassName: RandomChinese
 * @Description: ，①判断源字符串是否有值，空引号(空白字符串) 也算没值；②判断源字符串是否有值，空引号(空白字符串)和空格也算没
 *               值；③返回指定个数中文汉字字符串，字符集必须在 GB2312(相当于中文
 *               简体)范围内；④取名工具，返回中文姓名，必须以真实姓开头，试卷中附 有百家姓，名使用 1-2个随机汉字，内部调用③方法。
 * @author: ZK
 * @date: 2019年6月16日 下午6:48:18
 */
public class RandomChineseUtil {
	/**
	 * 
	 * @Title: getOneChinese
	 * @Description: ①判断源字符串是否有值，空引号(空白字符串) 也算没值；
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isStringEmpty(String str) {
		return str != null && str.length() > 0;
	}

	/**
	 * 
	 * @Title: isStringEmptyWithSpace
	 * @Description:②判断源字符串是否有值，空引号(空白字符串)和空格也算没 值
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isStringEmptyWithSpace(String str) {
		return str != null && str.trim().length() > 0;
	}

	/**
	 * 
	 * @Title: getChinese
	 * @Description: ③返回指定个数中文汉字字符串，字符集必须在 GB2312(相当于中文 简体)范围内
	 * @param num 指定的个数
	 * @return
	 * @return: String
	 */
	public static String getChinese(int num) {
		String str = "";
		int highPos, lowPos;
		for (int i = 0; i < num; i++) {
			Random random = new Random();
			highPos = 176 + Math.abs(random.nextInt(39));
			lowPos = 161 + Math.abs(random.nextInt(94));
			byte[] bs = new byte[2];
			bs[0] = (new Integer(highPos).byteValue());
			bs[1] = (new Integer(lowPos).byteValue());
			try {
				str += new String(bs, "GB2312");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			highPos = 0;
			lowPos = 0;
		}
		return str;
	}

	/**
	 * 
	 * @Title: getChineseName
	 * @Description: ④取名工具，返回中文姓名，必须以真实姓开头，试卷中附 有百家姓，名使用 1-2个随机汉字，内部调用③方法。
	 * @return
	 * @return: String
	 */
	public static String getChineseName() {
		String name = "";
		int index  = RandomNumUtil.getRandomNum(0, ChineseFirstNameUtil.Surname.length-1);
		name = ChineseFirstNameUtil.Surname[index];
		Random random = new Random();
		if (random.nextBoolean()) {
			name+= getChinese(2);
		}else {
			name+=getChinese(1);
		}
		return name;
	}
	/**
	 * @Title: getChinese 
	 * @Description: ③返回指定个数中文汉字字符串，字符集必须在 GB2312(相当于中文 简体)范围内
	 * @return
	 * @return: String
	 * @throws UnsupportedEncodingException 
	 */
	public static String getChinese() throws UnsupportedEncodingException {
		String str = "";
		str = (char)(new Random().nextInt(40869-19968+1)+19968)+"";
		if (str.equals(new String(str.getBytes("GB2312"), "GB2312"))) {
			return str;
		}
		return getChinese();
		
	}
}

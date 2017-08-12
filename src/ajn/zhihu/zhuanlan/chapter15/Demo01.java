package ajn.zhihu.zhuanlan.chapter15;

import java.io.UnsupportedEncodingException;

public class Demo01 {

	public static void main(String[] args) {
		byte[] str = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!' };
		String str1 = new String(str);
		String str2 = null;
		try {
			str2 = new String(str, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(str1);
		System.out.println(str2);
	}

}

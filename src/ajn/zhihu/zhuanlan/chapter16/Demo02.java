package ajn.zhihu.zhuanlan.chapter16;

import java.util.Date;

public class Demo02 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toLocaleString());
		System.out.println(date.getTime());
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
	}
}

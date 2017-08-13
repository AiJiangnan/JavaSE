package ajn.zhihu.zhuanlan.chapter16;

import java.util.Calendar;

public class Demo03 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());								// print: Sun Aug 13 09:39:41 CST 2017
		System.out.println(calendar.get(Calendar.YEAR));					// print: 2017
		System.out.println(calendar.get(Calendar.MONTH) + 1);				// print: 8
		System.out.println(calendar.get(Calendar.DATE));					// print: 13
		System.out.println(calendar.get(Calendar.HOUR));					// print: 9
		System.out.println(calendar.get(Calendar.MINUTE));					// print: 39
		System.out.println(calendar.get(Calendar.SECOND));					// print: 41
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));				// print: 1
		System.out.println(calendar.getMinimum(Calendar.DAY_OF_MONTH));		// print: 1
		System.out.println(calendar.getMaximum(Calendar.DAY_OF_MONTH));		// print: 31
	}

}

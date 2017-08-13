package ajn.zhihu.zhuanlan.chapter16;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04 {

	public static void main(String[] args) {
		// 先定义日期与字符串之间的转换格式
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 字符串转换日期
		Date date = null;
		try {
			date = dateFormat.parse("2017-01-01 11:11:11");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);					// print: Sun Jan 01 11:11:11 CST 2017
		// 日期转换为字符串
		Date date1 = new Date();
		String string = dateFormat.format(date1);
		System.out.println(string);					// print: 2017-08-13 09:55:59
	}

}

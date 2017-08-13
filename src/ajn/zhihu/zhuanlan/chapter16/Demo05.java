package ajn.zhihu.zhuanlan.chapter16;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();

		System.out.print("Please input date(2017-07-07): ");
		String dateStr = scanner.nextLine();

		try {
			calendar.setTime(format.parse(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		int today = calendar.get(Calendar.DAY_OF_MONTH);
		int maxday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");
		for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < maxday; i++) {
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
				System.out.println();
			if (calendar.get(Calendar.DAY_OF_MONTH) != today)
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + "\t");
			else
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + "*\t");
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
		scanner.close();
	}

}

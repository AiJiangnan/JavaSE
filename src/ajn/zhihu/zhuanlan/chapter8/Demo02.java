package ajn.zhihu.zhuanlan.chapter8;

import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) {
		int a[] = new int[2];
		boolean b[] = new boolean[2];
		String c[] = new String[2];
		System.out.println(""
				+ Arrays.toString(a)+"\n"		// print: [0, 0]
				+ Arrays.toString(b)+"\n"		// print: [false, false]
				+ Arrays.toString(c)+"\n");		// print: [null, null]
	}
}

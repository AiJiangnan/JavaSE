package ajn.zhihu.zhuanlan.chapter14;

import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) {
		int[] a = {1,3,2,4,6,5,10,9,8,7};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		// print:
		//	[1, 3, 2, 4, 6, 5, 10, 9, 8, 7]
		//	[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}
}

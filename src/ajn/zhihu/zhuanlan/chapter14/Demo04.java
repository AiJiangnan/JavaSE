package ajn.zhihu.zhuanlan.chapter14;

import java.util.Arrays;

public class Demo04 {
	public static void main(String[] args) {
		int[] a = {1,3,2,4,6,5,10,9,8,7};
		
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));		// print: 5
	}
}

package ajn.zhihu.zhuanlan.chapter14;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		int[] a = {1,3,2,4,6,5,10,9,8,7};
		int[] b = {1,3,2,4,6,5,10,9,8,7};
		int[] c = {1,3,2,4,6,5,10,9,8,8};
		
		System.out.println(a.equals(b));				// print: false
		System.out.println(Arrays.equals(a, b));		// print: true
		System.out.println(Arrays.equals(a, c));		// print: flases
	}
}

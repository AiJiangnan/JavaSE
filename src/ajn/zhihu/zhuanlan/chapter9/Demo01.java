package ajn.zhihu.zhuanlan.chapter9;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(a));			// print: [1, 2, 3, 4, 5, 6, 7, 8]
		clear(a);
		System.out.println(Arrays.toString(a));			// print: [0, 0, 0, 0, 0, 0, 0, 0]
	}

	public static void clear(int[] b){
		for(int i=0;i<b.length;i++){
			b[i] = 0;
		}
	}
}
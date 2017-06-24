package ajn.zhihu.zhuanlan.chapter8;

import java.util.Arrays;

public class Demo05 {
	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		int temp;
		for(int i=0;i<a.length-1;i++){
			System.err.println("Step: "+(i+1));
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				System.out.println(Arrays.toString(a));
			}
			System.out.println();
		}
	}
}

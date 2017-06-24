package ajn.zhihu.zhuanlan.chapter8;

import java.util.Arrays;

public class Demo06 {
	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		int temp;
		for(int i=1;i<a.length;i++){
			int j=i-1;
			temp=a[i];
			for(;j>=0&&temp<a[j];j--){
				a[j+1]=a[j];
			}
			a[j+1]=temp;
			System.out.println("Step: "+i+"\n"+Arrays.toString(a)+"\n");
		}
	}
}

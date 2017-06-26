package ajn.zhihu.zhuanlan.chapter8;

import java.util.Arrays;

public class Demo07 {
	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int elem = 7;		//要查询的元素
		int index = 0;
		int iStart = 0;
		int iEnd = a.length;
		for(int i=0;i<a.length/2;i++) {
			index = (iStart+iEnd)/2;
			if(a[index]<elem){
				iStart = index;
			}else if(a[index]>elem){
				iEnd = index;
			}else{
				System.out.println(index);
				break;
			}
		}
	}
}

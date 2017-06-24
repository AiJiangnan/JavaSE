package ajn.zhihu.zhuanlan.chapter8;

import java.util.Arrays;

public class Demo07 {
	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		Arrays.sort(a);
		int elem = 5;
		int index = 0;
		int iStart = 0;
		int iEnd = a.length-1;
		int searchCount = 0;
		for(int i=0;i<a.length/2;i++) {
			searchCount++;
			index = (iStart+iEnd)/2;
			if(a[index]<elem){
				System.out.println("aa");
				iStart = index;
			}else if(a[index]>elem){
				System.out.println("bb");
				iEnd = index;
			}else{
				break;
			}
		}
		System.out.println(searchCount);
	}
}

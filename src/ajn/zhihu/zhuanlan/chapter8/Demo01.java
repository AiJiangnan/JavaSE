package ajn.zhihu.zhuanlan.chapter8;

public class Demo01 {
	public static void main(String[] args) {
		int[] a = null;			// 1:声明数组
		a = new int[5];			// 2:构造数组
		for(int i=0;i<5;i++){
			a[i] = i;
			System.out.print(a[i]+"\t");
		}						// 3:给数组赋值
		// print: 0	1	2	3	4	
	}
}

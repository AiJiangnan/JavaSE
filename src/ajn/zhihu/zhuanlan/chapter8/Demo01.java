package ajn.zhihu.zhuanlan.chapter8;

public class Demo01 {
	public static void main(String[] args) {
		int[] a = null;			// 1:��������
		a = new int[5];			// 2:��������
		for(int i=0;i<5;i++){
			a[i] = i;
			System.out.print(a[i]+"\t");
		}						// 3:�����鸳ֵ
		// print: 0	1	2	3	4	
	}
}

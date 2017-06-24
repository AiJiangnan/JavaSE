package ajn.zhihu.zhuanlan.chapter8;

public class Demo03 {
	public static void main(String[] args) {
		int[][] a = {{0,0},{0,1},{1,0},{1,1}};
		// for
		for(int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----");
		// foreach
		for (int[] j : a) {
			for (int i : j) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		// print:
		//		0	0	
		//		0	1	
		//		1	0	
		//		1	1	
	}
}

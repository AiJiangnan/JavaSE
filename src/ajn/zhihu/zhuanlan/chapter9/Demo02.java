package ajn.zhihu.zhuanlan.chapter9;

public class Demo02 {
	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		int sum = add(a,b);
		System.out.println(sum);		// print: 7
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
}
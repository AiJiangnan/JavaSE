package ajn.zhihu.zhuanlan.chapter4;

public class Demo03 {
	public static void main(String[] args) {
		int a = 0x7fffffff;
		int b = 0x7ffffff0;

		float fa = a;
		float fb = b;

		System.out.println(fa);			//print: 2.14748365E9
		System.out.println(fb);			//print: 2.14748365E9
		System.out.println(a==b);		//print: false
		System.out.println(fa==fb);		//print: true
	}
}
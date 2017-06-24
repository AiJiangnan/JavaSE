package ajn.zhihu.zhuanlan.chapter5;

public class Demo03 {
	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		int c = a + b;
		System.out.println((c+=1) +"\n"		//print: 9
				+ (c-=1) +"\n"				//print: 8
				+ (c*=2) +"\n"				//print: 16
				+ (c/=2) +"\n");			//print: 8
	}
}

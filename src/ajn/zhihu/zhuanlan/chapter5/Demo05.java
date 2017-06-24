package ajn.zhihu.zhuanlan.chapter5;

public class Demo05 {
	public static void main(String[] args) {
		System.out.println(""
				+ ((3>2)&&(3<2)) +"\n"		//print: false
				+ ((3<2)||(3>2)) +"\n"		//print: true
				+ !(3>=3) +"\n");			//print: false
	}
}

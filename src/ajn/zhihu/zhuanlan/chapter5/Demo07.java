package ajn.zhihu.zhuanlan.chapter5;

public class Demo07 {
	public static void main(String[] args) {
		int a = 0xff;
		int b = 0;
		int c = a&b;
		System.out.println(""
				+ (a&b) +"\n"			//print: 0
				+ (a|b) +"\n"			//print: 255
				+ (~a) +"\n"			//print: -256
				+ (a^b) +"\n"			//print: 255
				+ (a>>2) +"\n"			//print: 63
				+ (a<<2) +"\n"			//print: 1020
				+ (a>>>2) +"\n");		//print: 63
		System.out.println(""
				+ Integer.toBinaryString(a&b) +"\n"			//print: 0
				+ Integer.toBinaryString(a|b) +"\n"			//print: 11111111
				+ Integer.toBinaryString(~a) +"\n"			//print: 11111111111111111111111100000000
				+ Integer.toBinaryString(a^b) +"\n"			//print: 11111111
				+ Integer.toBinaryString(a>>2) +"\n"		//print: 111111
				+ Integer.toBinaryString(a<<2) +"\n"		//print: 1111111100
				+ Integer.toBinaryString(a>>>2) +"\n");		//print: 111111
	}
}

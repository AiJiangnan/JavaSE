package ajn.zhihu.zhuanlan.chapter19;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);						// print: -2147483648
		System.out.println(Integer.MAX_VALUE);						// print: 2147483647
		System.out.println(Integer.SIZE);							// print: 32
		String a = "120";
		byte b = 121;
		System.out.println(Integer.parseInt(a));					// print: 120
		System.out.println(Integer.valueOf(b));						// print: 121
		System.out.println(Integer.valueOf(b) instanceof Integer);	// print: tru
	}
}

package ajn.zhihu.zhuanlan.chapter19;

public class Demo01 {
	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);						// print: -128
		System.out.println(Byte.MAX_VALUE);						// print: 127
		System.out.println(Byte.SIZE);							// print: 8
		String a = "120";
		byte b = 121;
		System.out.println(Byte.parseByte(a));					// print: 120
		System.out.println(Byte.valueOf(b));					// print: 121
		System.out.println(Byte.valueOf(b) instanceof Byte);	// print: true
	}
}

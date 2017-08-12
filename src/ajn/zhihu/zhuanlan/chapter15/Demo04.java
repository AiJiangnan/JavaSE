package ajn.zhihu.zhuanlan.chapter15;

public class Demo04 {

	public static void main(String[] args) {
		String str1 = "Hello world!";
		String str2 = "Hello World!";
		System.out.println(str1.equals(str2));				// print: false
		System.out.println(str1.equalsIgnoreCase(str2));	// print: true
		System.out.println(str1.compareTo(str2));			// print: 32
	}

}

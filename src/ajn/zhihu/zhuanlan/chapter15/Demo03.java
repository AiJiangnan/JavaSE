package ajn.zhihu.zhuanlan.chapter15;

public class Demo03 {

	public static void main(String[] args) {
		String str = "Hello world!";
		System.out.println(str.endsWith("rld!"));		// print: true
		System.out.println(str.startsWith("Hel"));		// print: true
		System.out.println(str.indexOf("o"));			// print: 4
		System.out.println(str.lastIndexOf("o"));		// print: 7
	}

}

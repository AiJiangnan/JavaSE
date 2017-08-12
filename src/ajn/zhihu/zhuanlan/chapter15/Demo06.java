package ajn.zhihu.zhuanlan.chapter15;

public class Demo06 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		StringBuffer str2 = new StringBuffer(" world!");
		System.out.println(str.append(str2));		// print: Hello world!
		System.out.println(str.delete(2, 5));		// print: He world!
		System.out.println(str.insert(2, "llo"));	// print: Hello world!
		System.out.println(str.reverse());			// print: !dlrow olleH
	}

}

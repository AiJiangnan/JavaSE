package ajn.zhihu.zhuanlan.chapter15;

public class Demo02 {

	public static void main(String[] args) {
		String str = "Hello world!";
		String str2 = " Java ";
		System.out.println(str.concat(str2));				// 连接
		System.out.println(str.replace("world", "Java"));	// 替换
		System.out.println(str.substring(6, 11));			// 截取
		System.out.println(str.toLowerCase());				// 小写
		System.out.println(str.toUpperCase());				// 大写
		System.out.println(str2.trim());					// 去白
	}

}
	// print:
	//	Hello world! Java 
	//	Hello Java!
	//	world
	//	hello world!
	//	HELLO WORLD!
	//	Java
package ajn.zhihu.zhuanlan.chapter15;

public class Demo02 {

	public static void main(String[] args) {
		String str = "Hello world!";
		String str2 = " Java ";
		System.out.println(str.concat(str2));				// ����
		System.out.println(str.replace("world", "Java"));	// �滻
		System.out.println(str.substring(6, 11));			// ��ȡ
		System.out.println(str.toLowerCase());				// Сд
		System.out.println(str.toUpperCase());				// ��д
		System.out.println(str2.trim());					// ȥ��
	}

}
	// print:
	//	Hello world! Java 
	//	Hello Java!
	//	world
	//	hello world!
	//	HELLO WORLD!
	//	Java
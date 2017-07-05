package ajn.zhihu.zhuanlan.chapter12;

import java.io.FileInputStream;
import java.io.InputStream;

public class Demo02 {
	static int a = 1;
	public static void main(String[] args){
		InputStream is = null;
		try {
			System.out.println("try: "+(a++));
			is = new FileInputStream("readme.txt");
			return;
		} catch (Exception e) {
			System.out.println("catch: "+(a++));
			e.printStackTrace();
		}finally{
			System.out.println("finally: "+(a++));
		}
	}
}

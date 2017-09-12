package ajn.zhihu.zhuanlan.chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo07 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("F:/example.properties"));
		String age = (String) properties.get("age");
		String name = (String) properties.get("name");
		System.out.println(age);                          // print: 22
		System.out.println(name);                         // print: AiJiangnan
	}
}

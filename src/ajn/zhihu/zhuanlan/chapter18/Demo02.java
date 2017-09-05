package ajn.zhihu.zhuanlan.chapter18;

import java.io.File;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		File file = new File("G:/hello.txt");
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}

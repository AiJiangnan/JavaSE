package ajn.zhihu.zhuanlan.chapter12;

import java.io.File;
import java.io.FileNotFoundException;

public class Demo04 {
	public static void main(String[] args) {
		File f = new File("c:/tt.txt");
		if (!f.exists()) {
			try {
				throw new FileNotFoundException("File can't be found!");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}

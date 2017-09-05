package ajn.zhihu.zhuanlan.chapter18;

import java.io.File;

public class Demo03 {
	public static void main(String[] args) {
		File file = new File("G:/я╦ювобть");
		for (String filename : file.list())
			System.out.println(filename);
	}
}

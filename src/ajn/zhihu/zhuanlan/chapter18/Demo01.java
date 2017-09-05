package ajn.zhihu.zhuanlan.chapter18;

import java.io.File;

public class Demo01 {
	public static void main(String[] args) {
		for (File file : File.listRoots()) {
			System.out.println(file);
		}
	}
}

// print:
//	C:\
//	D:\
//	E:\
//	F:\
//	G:\

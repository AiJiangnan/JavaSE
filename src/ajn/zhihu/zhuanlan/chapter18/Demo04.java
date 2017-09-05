package ajn.zhihu.zhuanlan.chapter18;

import java.io.File;
import java.io.FileFilter;

public class Demo04 {
	public static void main(String[] args) {
		File dir = new File("G:/Ѹ������");
		File[] files = dir.listFiles(new Filter());
		for (int i = 0; i < files.length; i++) {
			files[i].renameTo(new File(dir, "[���ķ�ʦ2]��" + (i + 10) + "��.mp4"));
		}
	}
}

class Filter implements FileFilter {
	@Override
	public boolean accept(File file) {
		if (file.isDirectory())
			return false;
		if (file.getName().indexOf(".mp4") > 0)
			return true;
		return false;
	}
}
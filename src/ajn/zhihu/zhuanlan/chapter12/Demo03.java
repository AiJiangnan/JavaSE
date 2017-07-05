package ajn.zhihu.zhuanlan.chapter12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) {
		try {
			readFile("joke.txt");
		} catch (FileNotFoundException e) {
			System.out.println("�����ļ������ڣ�");
		} catch (IOException e) {
			System.out.println("�ļ���д����");
		}
	}

	public static void readFile(String fileName) throws FileNotFoundException,IOException{
		FileReader in = new FileReader(fileName);
		int tem = 0;
		try {
			tem = in.read();
			while (tem != -1) {
				System.out.print((char) tem);
				tem = in.read();
			}
		} finally {
			in.close();
		}
	}
}

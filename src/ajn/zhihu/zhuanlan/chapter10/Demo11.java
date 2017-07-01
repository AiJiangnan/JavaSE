package ajn.zhihu.zhuanlan.chapter10;

public class Demo11 {
	public static void main(String[] args) {
		Transportation car = new Car();
		car.run();			// print: ������ʻ�ڹ�·�ϡ�
		car.manned();		// print: �һ������ˡ�
	}
}

abstract class Transportation{
	public abstract void run();
	public abstract void manned();
}

class Car extends Transportation{

	@Override
	public void run() {
		System.out.println("������ʻ�ڹ�·�ϡ�");
	}

	@Override
	public void manned() {
		System.out.println("�һ������ˡ�");
	}
}
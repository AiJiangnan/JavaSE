package ajn.zhihu.zhuanlan.chapter10;

public class Demo11 {
	public static void main(String[] args) {
		Transportation car = new Car();
		car.run();			// print: 我能行驶在公路上。
		car.manned();		// print: 我还能载人。
	}
}

abstract class Transportation{
	public abstract void run();
	public abstract void manned();
}

class Car extends Transportation{

	@Override
	public void run() {
		System.out.println("我能行驶在公路上。");
	}

	@Override
	public void manned() {
		System.out.println("我还能载人。");
	}
}
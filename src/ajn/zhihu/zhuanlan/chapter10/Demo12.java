package ajn.zhihu.zhuanlan.chapter10;

public class Demo12 {
	public static void main(String[] args) {
		Test t = new Test();
		t.testA();		// print: I am testA!
		t.testB();		// print: I am testB!
		t.testC();		// print: I am testC!
	}
}

interface A{
	public void testA();
}

interface B{
	public void testB();
}

interface C extends A,B{
	public void testC();
}

class Test implements C{

	@Override
	public void testA() {
		System.out.println("I am testA!");
	}

	@Override
	public void testB() {
		System.out.println("I am testB!");
	}

	@Override
	public void testC() {
		System.out.println("I am testC!");
	}
}
package ajn.zhihu.zhuanlan.chapter11;

public class Demo02 {
	public static void main(String[] args) {
		Outer.In in = new Outer.In();
		in.print();			// print: 12
	}
}

class Outer{
	private static int a=12;
	
	static class In{
		public void print() {
			System.out.println(a);
		}
	}
}
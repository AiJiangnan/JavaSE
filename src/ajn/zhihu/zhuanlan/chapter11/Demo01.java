package ajn.zhihu.zhuanlan.chapter11;

public class Demo01 {
	public static void main(String[] args) {
		Out out = new Out();
		Out.In in = out.new In();
		in.print();			// print: 10
	}
}

class Out{
	private int a=10;
	
	class In{
		public void print() {
			System.out.println(a);
		}
	}
}
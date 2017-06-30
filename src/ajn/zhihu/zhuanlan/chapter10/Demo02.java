package ajn.zhihu.zhuanlan.chapter10;

public class Demo02 {
	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);
		double d = p1.getDistance(p2);
		System.out.println("p1--p2: " + d);		// print: p1--p2: 5.0
	}
}

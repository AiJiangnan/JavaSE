package ajn.zhihu.zhuanlan.chapter13;

public class Demo01 {
	public static void main(String[] args) {
		Person p1 = new Person(18, "Alice");
		Person p2 = new Person(18, "Alice");
		System.out.println(p1==p2);				// print: false
		System.out.println(p1.equals(p2));		// print: true
	}
}

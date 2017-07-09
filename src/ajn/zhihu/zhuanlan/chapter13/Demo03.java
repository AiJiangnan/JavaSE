package ajn.zhihu.zhuanlan.chapter13;

public class Demo03 {
	public static void main(String[] args) {
		Person p1 = new Person(18, "Alice");
		Person p2 = new Person(18, "Alice");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}

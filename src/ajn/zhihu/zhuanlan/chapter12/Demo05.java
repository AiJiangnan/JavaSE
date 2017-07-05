package ajn.zhihu.zhuanlan.chapter12;

public class Demo05 {
	public static void main(String[] args) {
		Person p1 = new Person("Alice", 18);
		Person p2 = new Person("Bob", 20);
		try {
			p2.setAge(121);
		} catch (AgeException e) {
			e.printStackTrace();
		}
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());
	}
}

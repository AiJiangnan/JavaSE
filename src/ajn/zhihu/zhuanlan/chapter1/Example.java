package ajn.zhihu.zhuanlan.chapter1;

public class Example {
	public static void main(String[] args) {
		Person p1 = new Person("XiaoMing");
		Person p2 = new Person("XiaoHua");
		p1.beat(p2);
	}
}

class Person{
	String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public void beat(Person p){
		System.out.println(this.name+"--->"+p.name);
	}
}

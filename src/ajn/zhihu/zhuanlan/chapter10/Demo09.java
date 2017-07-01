package ajn.zhihu.zhuanlan.chapter10;

public class Demo09 {
	public static void main(String[] args) {
		Cat c = new Cat(2, 'W', "XiaoHua");
		c.eat();		// print: Cat eats mouse!
	}
}

class Cat extends Animal{
	private String name;

	public Cat(int age, char gender, String name) {
		super(age, gender);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Cat eats mouse!");
	}
}
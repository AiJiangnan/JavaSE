package ajn.zhihu.zhuanlan.chapter10;

public class Demo10 {
	public static void main(String[] args) {
		Animal c1 = new Cat(2,'W',"XiaoHong");
		Cat c2 = new Cat(1,'M',"XiaoBai");
		c1.eat();			// print: Cat eats mouse!
		c2.eat();			// print: Cat eats mouse!
		c2 = (Cat)c1;
		System.out.println(c1 instanceof Animal);		// print: true
		System.out.println(c1 instanceof Cat);			// print: true
	}
}

package ajn.zhihu.zhuanlan.chapter10;

public class Demo03 {
	public static void main(String[] args) {
		People p1 = new People("Alice", 18);
		People p2 = new People("Clork", 23);
		p2.setAge(20);;
		System.out.println(""
				+"Name\tAge\n"
				+p1.getName()+"\t"+p1.getAge()+"\n"
				+p2.getName()+"\t"+p2.getAge());
	}
	// print: 
	//	Name	Age
	//	Alice	18
	//	Clork	20
}

class People{
	private String name;
	private int age;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
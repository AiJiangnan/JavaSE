package ajn.zhihu.zhuanlan.chapter10;

public class Demo01 {
	public static void main(String[] args) {
		Student s1 = new Student("Alice",18);
		Student s2 = new Student("Bob",20);
		System.out.println(""
				+ "Name: " + s1.name + "\tAge: " + s1.age + "\n"
				+ "Name: " + s2.name + "\tAge: " + s2.age);
	}
	// print: 
	//	Name: Alice	Age: 18
	//	Name: Bob	Age: 20
}

class Student{
	String name;
	int age;
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}
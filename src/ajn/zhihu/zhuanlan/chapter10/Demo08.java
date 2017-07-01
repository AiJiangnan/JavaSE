package ajn.zhihu.zhuanlan.chapter10;

public class Demo08 {
	public static void main(String[] args) {
		Dog d = new Dog(2, 'M', "Taidi");
		System.out.println(""
				+"Name:\t"+d.getName()+"\n"
				+"Gender:\t"+d.getGender()+"\n"
				+"Age:\t"+d.getAge());
		d.eat();
		d.bark();
	}
	// print:
	//	Name:	Taidi
	//	Gender:	M
	//	Age:	2
	//	Animal can eat!
	//	Wang Wang Wang!
}

class Animal{
	private int age;
	private char gender;
	
	public Animal(int age, char gender) {
		this.age = age;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void eat() {
		System.out.println("Animal can eat!");
	}
}

class Dog extends Animal{
	private String name;
	
	public Dog(int age, char gender, String name) {
		super(age, gender);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void bark(){
		System.out.println("Wang Wang Wang!");
	}
}
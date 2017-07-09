package ajn.zhihu.zhuanlan.chapter13;

public class Person {
	private int age;
	private String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null)?0:name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(obj instanceof Person){
			return (age==((Person)obj).age) && (name.equals(((Person)obj).name));
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [age = " + age + ", name = " + name + "]";
	}
}

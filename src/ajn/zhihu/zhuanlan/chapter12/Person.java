package ajn.zhihu.zhuanlan.chapter12;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) throws AgeException {
		if(age<0 || age>120){
			throw new AgeException("…Ë÷√ƒÍ¡‰”–ŒÛ!");
		}else{
			this.age = age;
		}
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
}

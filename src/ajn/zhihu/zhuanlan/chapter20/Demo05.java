package ajn.zhihu.zhuanlan.chapter20;

import java.util.TreeSet;

public class Demo05 {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person(11, "Alice"));
		treeSet.add(new Person(12, "Bob"));
		treeSet.add(new Person(11, "Click"));
		treeSet.add(new Person(14, "Ded"));
		treeSet.add(new Person(15, "Eric"));
		System.out.println(treeSet);
		// print: [Person [age=11, name=Alice], Person [age=11, name=Click], Person [age=12, name=Bob], Person [age=14, name=Ded], Person [age=15, name=Eric]]
	}
}

class Person implements Comparable<Person> {

	private int age;
	private String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		if (this.age != o.age)
			return age > o.age ? 1 : -1;
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}

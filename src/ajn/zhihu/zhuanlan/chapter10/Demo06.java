package ajn.zhihu.zhuanlan.chapter10;

public class Demo06 {
	public static void main(String[] args) {
		Stu s1 = new Stu("Alice", 1200);
		s1.payTuition();
		Stu s2 = new Stu("Bob", 1300);
		s2.payTuition();
		System.out.println("Total: $"+Stu.tuition);
	}
	// print:
	//	Alice pay tuition fee $1200
	//	Bob pay tuition fee $1300
	//	Total: $2500
}

class Stu{
	private String name;
	private int tuit;
	public static int tuition;
	
	public Stu(String name, int tuit) {
		this.name = name;
		this.tuit = tuit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTuit() {
		return tuit;
	}

	public void setTuit(int tuit) {
		this.tuit = tuit;
	}
	
	public void payTuition(){
		tuition += tuit;
		System.out.println(name+" pay tuition fee $"+tuit);
	}
}
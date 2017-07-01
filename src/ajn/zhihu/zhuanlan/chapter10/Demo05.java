package ajn.zhihu.zhuanlan.chapter10;

public class Demo05 {
	public static void main(String[] args) {
		Phone p1 = new Phone("Nokia");
		Phone p2 = new Phone("IPhone", "2016");
		System.out.println("Type: "+p1.getType()+"\tData: "+p1.getDate());
		p1.support2G();
		System.out.println("Type: "+p2.getType()+"\tData: "+p2.getDate());
		p2.support3G();
	}
	// print: 
	//	Type: Nokia	Data: null
	//	I can suppoort 2G!
	//	Type: IPhone	Data: 2016
	//	I can suppoort 2G!
	//	I can suppoort 3G!
}

class Phone{
	private String type;
	private String date;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Phone(String type) {
		this.type = type;
	}

	public Phone(String type, String date) {
		this(type);
		this.date = date;
	}
	
	public void support2G(){
		System.out.println("I can suppoort 2G!");
	}
	
	public void support3G(){
		this.support2G();
		System.out.println("I can suppoort 3G!");
	}
}
package ajn.zhihu.zhuanlan.chapter6;

public class Demo04 {
	public static void main(String[] args) {
		int grade = 75;
		switch(grade/10){
		case 10:
		case 9:
			System.out.println("A");break;
		case 8:
		case 7:
			System.out.println("B");break;
		case 6:
			System.out.println("C");break;
		default:
			System.out.println("D");
		}
	}
}

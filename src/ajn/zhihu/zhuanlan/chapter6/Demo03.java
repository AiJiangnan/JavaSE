package ajn.zhihu.zhuanlan.chapter6;

public class Demo03 {
	public static void main(String[] args) {
		int grade = 75;
		if(grade < 60){
			System.out.println("D");
		}else if(grade < 70){
			System.out.println("C");
		}else if(grade < 90){
			System.out.println("B");
		}else{
			System.out.println("A");
		}
	}
}

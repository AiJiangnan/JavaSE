package ajn.zhihu.zhuanlan.chapter9;

public class Demo05 {
	public static void main(String[] args) {
		System.out.println(""
				+"3!="+factorial(3)+"\n"			// print: 3!=6
				+"4!="+factorial(4)+"\n"			// print: 4!=24
				+"5!="+factorial(5)+"\n"			// print: 5!=120
				+"6!="+factorial(6)+"\n");			// print: 6!=720
	}
	
	public static int factorial(int n){
		if(n<2){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
}
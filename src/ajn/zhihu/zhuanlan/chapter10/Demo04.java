package ajn.zhihu.zhuanlan.chapter10;

public class Demo04 {
	public static void main(String[] args) {
		int sum1 = add(1,2,3,4);
		double sum2 = add(1.1,2.2,3.3,4.4);
		System.out.println(sum1);		// print: 10
		System.out.println(sum2);		// print: 11.0
	}
	
	public static int add(int...a) {
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
	
	public static double add(double...a) {
		double sum = 0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
}

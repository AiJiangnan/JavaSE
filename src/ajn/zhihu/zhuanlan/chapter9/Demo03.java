package ajn.zhihu.zhuanlan.chapter9;

public class Demo03 {
	public static int add(int...a) {
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(""
				+ "1+2="+add(1,2)+"\n"					// print: 1+2=3
				+ "1+2+3="+add(1,2,3)+"\n"					// print: 1+2+3=6
				+ "1+2+3+4="+add(1,2,3,4)+"\n"					// print: 1+2+3+4=10
				+ "1+2+3+4+5="+add(1,2,3,4,5)+"\n");				// print: 1+2+3+4+5=15
	}
}
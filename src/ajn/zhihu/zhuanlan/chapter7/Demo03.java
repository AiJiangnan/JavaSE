package ajn.zhihu.zhuanlan.chapter7;

public class Demo03 {
	public static void main(String[] args) {
		int i = 1;
		while(i<10){
			int j = 1;
			while(j<=i){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}

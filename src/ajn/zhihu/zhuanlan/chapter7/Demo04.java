package ajn.zhihu.zhuanlan.chapter7;

public class Demo04 {
	public static void main(String[] args) {
		int i = 1;
		do{
			int j = 1;
			do{
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				j++;
			}while(j<=i);
			i++;
			System.out.println();
		}while(i<10);
	}
}

package ajn.zhihu.zhuanlan.chapter7;

public class Demo08 {
	public static void main(String[] args) {
		int size = 5;
		for(int i=0;i<(size+1);i++){
			for(int j=size;j>i;j--){
				System.out.print(" ");
			}
			for(int j=0;j<(2*i+1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=(2*size-1);j>2*i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package ajn.zhihu.zhuanlan.chapter7;

public class Demo01 {
	public static void main(String[] args) {
		int s = 0;
		int i = 1;
		while(true){
			s+=i++;
			if(i>100)
				break;
		}
		System.out.println(s);
	}
}

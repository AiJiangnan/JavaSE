package ajn.zhihu.zhuanlan.chapter7;

public class Demo02 {
	public static void main(String[] args) {
		int s = 0;
		for(int i=0;i<=100;i++){
			if(i%2==1)
				continue;
			s+=i;
		}
		System.out.println(s);		//print: 2550
	}
}

package ajn.zhihu.zhuanlan.chapter10;

public class Demo13 {
	public static void main(String[] args) {
		Season s1 = Season.´º;
		Season s2 = Season.values()[1];
		System.out.println(s1+","+s2);		// print: ´º,ÏÄ
	}
}

enum Season{
	´º,ÏÄ,Çï,¶¬
}
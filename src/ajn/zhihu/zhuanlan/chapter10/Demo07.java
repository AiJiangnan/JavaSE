package ajn.zhihu.zhuanlan.chapter10;

public class Demo07 {
	public static void main(String[] args) {
		new Static();
	}
	// print:
	//	I am a static block!
	//	I am a normal block!
	//	I am a constructor!
}

class Static{
	static{
		System.out.println("I am a static block!");
	}

	{
		System.out.println("I am a normal block!");
	}

	public Static() {
		System.out.println("I am a constructor!");
	}
}
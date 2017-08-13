package ajn.zhihu.zhuanlan.chapter17;

import java.util.Arrays;
import java.util.Random;

public class Demo02 {

	public static void main(String[] args) {
		Random random = new Random();
		byte[] bytes = new byte[3];
		System.out.println(random.nextBoolean());		// print: true
		System.out.println(random.nextInt());			// print: -317394596
		System.out.println(random.nextInt(10));			// print: 2
		System.out.println(random.nextLong());			// print: 5921830842637186443
		System.out.println(random.nextFloat());			// print: 0.46580416
		System.out.println(random.nextDouble());		// print: 0.5405973275142383
		random.nextBytes(bytes);
		System.out.println(Arrays.toString(bytes));		// print: [125, -103, -90]
	}

}

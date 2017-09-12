package ajn.zhihu.zhuanlan.chapter20;

import java.util.List;
import java.util.Vector;

public class Demo02 {
	public static void main(String[] args) {
		List<String> vector = new Vector<>();
		vector.add("Alice");
		vector.add("Bob");
		vector.add(1, "Click");
		System.out.println(vector);					// print: [Alice, Click, Bob]
		vector.remove(1);
		System.out.println(vector);					// print: [Alice, Bob]
		for (String string : vector) {
			System.out.println(string);				// print:  Alice
		}                                       	//         Bob
		for (int i = 0; i < vector.size(); i++) {	// print:  Alice
			System.out.println(vector.get(i));		//         Bob
		}
	}
}

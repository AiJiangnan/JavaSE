package ajn.zhihu.zhuanlan.chapter20;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Alice");
		list.add("Bob");
		list.add(1, "Click");
		System.out.println(list);					// print: [Alice, Click, Bob]
		list.remove(1);
		System.out.println(list);					// print: [Alice, Bob]
		for (String string : list) {
			System.out.println(string);				// print:  Alice
		}                                       	//         Bob
		for (int i = 0; i < list.size(); i++) {		// print:  Alice
			System.out.println(list.get(i));		//         Bob
		}
	}
}

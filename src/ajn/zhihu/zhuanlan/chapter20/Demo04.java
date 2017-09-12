package ajn.zhihu.zhuanlan.chapter20;

import java.util.HashSet;

public class Demo04 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Alice");
		hashSet.add("Bob");
		hashSet.add("Click");
		hashSet.add("Ded");
		hashSet.remove("Ded");
		hashSet.add("Eric");
		hashSet.add("Frank");
		System.out.println(hashSet);				// print: [Alice, Frank, Eric, Bob, Click]
		for (String string : hashSet) {
			System.out.println(string);
		}
		// print:
		//   Alice
		//   Frank
		//   Eric
		//   Bob
		//   Click
	}
}

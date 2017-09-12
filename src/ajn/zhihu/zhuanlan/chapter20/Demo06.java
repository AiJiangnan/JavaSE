package ajn.zhihu.zhuanlan.chapter20;

import java.util.HashMap;
import java.util.Map;

public class Demo06 {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Alice");
		hashMap.put(2, "Bob");
		hashMap.put(3, "Click");
		hashMap.put(3, "Click1");
		hashMap.put(4, "Ded");
		hashMap.put(5, "Eric");
		hashMap.put(null, null);
		System.out.println(hashMap);			// print: {null=null, 1=Alice, 2=Bob, 3=Click1, 4=Ded, 5=Eric}
	}
}

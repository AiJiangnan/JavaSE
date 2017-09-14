package ajn.zhihu.zhuanlan.chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo08 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 5);
		Collections.addAll(list2, 0, 0, 0, 0, 0);
		System.out.println(list);							// print: [1, 2, 3, 4, 5]
		Collections.copy(list2, list);
		System.out.println(list2);							// print: [1, 2, 3, 4, 5]
		Collections.fill(list2, 0);
		System.out.println(list2);							// print: [0, 0, 0, 0, 0]
		System.out.println(Collections.max(list));			// print: 5
		System.out.println(Collections.min(list));			// print: 1
		Collections.reverse(list);
		System.out.println(list);							// print: [5, 4, 3, 2, 1]
		Collections.swap(list, 0, 4);
		System.out.println(list);							// print: [1, 4, 3, 2, 5]
	}
}

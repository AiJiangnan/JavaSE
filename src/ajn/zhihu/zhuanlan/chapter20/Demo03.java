package ajn.zhihu.zhuanlan.chapter20;

import java.util.Stack;

public class Demo03 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Alice");
		stack.push("Bob");
		stack.push("Click");
		stack.push("Ded");
		System.out.println(stack);              // print: [Alice, Bob, Click, Ded]
		String pop = stack.pop();
		System.out.println(pop);                // print: Ded
		System.out.println(stack);              // print: [Alice, Bob, Click]
	}
}

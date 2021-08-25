package algo_live4;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();
		
		System.out.println(stack.isEmpty()+"/"+stack.size());
		
		stack.push("황선우");
		stack.push("김연경");
		stack.push("우상혁");
		stack.push("여서정");
		stack.push("김재환");
		
		
		System.out.println(stack.isEmpty()+"/"+stack.size());
		if(stack.peek() == "김재환") {System.out.println("되니?");}
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
//		stack2.push(stack.pop());
//		stack2.push(stack.pop());
//		stack2.push(stack.pop());
//		stack2.push(stack.pop());
//		stack2.push(stack.pop());
//		System.out.println(stack2.pop());
//		System.out.println(stack2.pop());
//		System.out.println(stack2.pop());
//		System.out.println(stack2.pop());
//		System.out.println(stack2.pop());
		
		System.out.println(stack.isEmpty()+"/"+stack.size());
		if(!stack.isEmpty()) {
		System.out.println(stack.pop());
		}
		

	}

}

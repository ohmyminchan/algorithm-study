package day5;

import java.util.Scanner;
import java.util.Stack;

public class BJ_4949 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb;
		String cut = ".";
		int open1 = 0,open2=0;
		Stack<String> stack = new Stack<String>();

		outer : while (true) {
			String s = sc.nextLine();
			String[] ss = s.split("");

			for (int i = 0; i < ss.length; i++) {
				if (ss[0].equals(cut)) {
					break outer;
				}
				if (ss[i].equals("[")) {
					stack.push("[");
				}
				else if(ss[i].equals("(")) {
					stack.push("(");
				}
				if (ss[i].equals("]")) {
					if(stack.isEmpty()) {
						System.out.println("no");
						stack.clear();
						continue outer;
					}
					if(stack.peek().equals("[")) {
						stack.pop();
					}else {
						System.out.println("no");
						stack.clear();
						continue outer;
					}
				}
				else if(ss[i].equals(")")) {
					if(stack.isEmpty()) {
						System.out.println("no");
						stack.clear();
						continue outer;
					}
					if(stack.peek().equals("(")) {
						stack.pop();
					}else {
						System.out.println("no");
						stack.clear();
						continue outer;
					}
				}
				
			}
			
			if(stack.isEmpty())
			System.out.println("yes");
			else {
				System.out.println("no");
				stack.clear();
			}

		}

	}

}

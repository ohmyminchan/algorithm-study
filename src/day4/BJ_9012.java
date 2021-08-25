package day4;

import java.util.Scanner;
import java.util.Stack;

public class BJ_9012 {
	

	public static void main(String[] args) {
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		Stack<Character> stack3 = new Stack<Character>();
		
		
		char arro = '(';
		char arrc = ')';
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int cnt = 0;
			
			//sc.nextLine();
			String s = sc.next();
			//String[] ss = s.split("\n");
			for (int i = 0; i < s.length(); i++) {
				
				
					if (s.charAt(i) == arro) { // 여는문 인식
						stack1.push(s.charAt(i));
						cnt++;
					}
				
					if (s.charAt(i) == arrc) { // 닫는문 인식
						if(stack1.isEmpty()) {
							cnt = -100;
							break;
						}
						if(!stack1.isEmpty()) {
						if(stack1.peek() == arro) {
							stack1.pop();
							cnt--;
						}
						}
					}
				
			}
			//System.out.println(cnt);
			if(stack1.isEmpty()) {
				if(cnt == 0)
				System.out.println("YES");
				else System.out.println("NO");
			}
			else if(cnt != 0) System.out.println("NO");
			
			else System.out.println("NO");
			stack1.clear();
	}

}
}
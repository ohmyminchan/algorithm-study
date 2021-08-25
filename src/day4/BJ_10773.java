package day4;

import java.util.Scanner;
import java.util.Stack;

public class BJ_10773 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for(int i=0;i<X;i++) {
			int n= sc.nextInt();
			
			if(n==0 && !stack.isEmpty()) {
				stack.pop();
			}
			
			else stack.push(n);
		}
		int sum=0; 
		
		for(int a : stack) {
			sum+=a;
		}
		System.out.println(sum);
	}

}

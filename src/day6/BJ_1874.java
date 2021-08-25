package day6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BJ_1874 {
	static Stack<Integer> stack = new Stack<Integer>();
	static Queue<Integer> queue = new LinkedList<Integer>();
	static int index = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		boolean finish=true;
		stack.push(index);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int k = sc.nextInt();
			if (k == stack.peek()) {
				stack.pop();
				queue.offer(1);
			}

			else if (k > stack.peek()) {
				while (k != stack.peek()) {
					stack.push(++index);
					queue.offer(2);
				}
				if (k == stack.peek()) {
					stack.pop();
					queue.offer(1);
				}
			}
			else {finish = false;}
		}

		if(finish == true) {
		while (queue.isEmpty() != true) {
			int q = queue.poll();
			if (q == 1) {
				System.out.println("-");
			} else
				System.out.println("+");

		}
		}
		else {System.out.println("NO");}

	}

}

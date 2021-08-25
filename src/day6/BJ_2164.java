package day6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2164 {

	public static void main(String[] args) {
	Queue<Integer> queue = new LinkedList<Integer>();
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	for(int i=1;i<=N;i++) {
		queue.offer(i);
	}

	outer : for(int i=1;i<Integer.MAX_VALUE;i++) {
	if(queue.size() == 1) {
		System.out.println(queue.poll());
		break outer;
	}
		if(i%2==1) {
		queue.poll();
	}
	if(i%2==0) {
		int x = queue.poll();
		queue.offer(x);
	}

	}

	}

}

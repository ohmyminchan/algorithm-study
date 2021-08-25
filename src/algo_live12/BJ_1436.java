package algo_live12;

import java.util.LinkedList;
import java.util.Scanner;

public class BJ_1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();

		int N = sc.nextInt();
		int answer = 1;
		for (int i = 666; i <= 2666799; i++) {
			boolean isit = false;
			String s = Integer.toString(i);
			if (s.contains("666")) {
				isit = true;
			}else {
				continue;
			}

			if (isit == true) {
				list.offer(i);
			}
		}

		System.out.println(list.get(N - 1));

	}

}

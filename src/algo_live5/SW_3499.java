package algo_live5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SW_3499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++) {
			Queue<String> queue1 = new LinkedList<String>();
			Queue<String> queue2 = new LinkedList<String>();
			String ans[];
			int k=sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			ans = new String[k];
			if(k%2 == 0) {
			for(int i=0;i<k;i++) {
				if(i < k/2) {
					queue1.offer(ss[i]);
					continue;
				}
				if(i>= k/2) {
					queue2.offer(ss[i]);
				}
			}
			}
			if(k%2 == 1) {
				for(int i=0;i<k;i++) {
					if(i <= k/2) {
						queue1.offer(ss[i]);
						continue;
					}
					if(i> k/2) {
						queue2.offer(ss[i]);
					}
				}
				}
			
			
		
			
			for(int i=0;i<k;i++) {
				if(i%2 == 0) {
					ans[i] = queue1.poll();
				}
				else if(i%2 == 1) {
					ans[i] = queue2.poll();
				}
			}
			System.out.printf("#%d ",(t+1));
			for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]);
			System.out.printf(" ");
			}
			System.out.println();
					
			
			
		}

	}

}

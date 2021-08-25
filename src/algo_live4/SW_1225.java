package algo_live4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SW_1225 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int t=0;t<T;t++) {
			int temp=1;
			int x = sc.nextInt();
			for(int i=0;i<8;i++) {
			temp = sc.nextInt();
			queue.offer(temp);
			}
			int q=1;
			while(temp>0) {
			
			
			temp=(queue.poll()-q);
			if(temp<0) {temp=0;}
			queue.offer(temp);
			++q;
			if(q==6) {q=1;}
			}
			
			System.out.print("#"+(t+1)+" ");
			for(int o=0;o<8;o++) {
			System.out.print(queue.poll()+" ");
			}
			System.out.println();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}

package day6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			LinkedList<Integer> queue = new LinkedList<Integer>();
			int r = sc.nextInt();
			int c = sc.nextInt();
			int index = 1;
			for(int i=0;i<r;i++) {
				queue.add(i, sc.nextInt());
			}
			Iterator it = queue.iterator();
			while(it.hasNext()) {
				boolean isup = false;
				int x = queue.poll();
				if(queue.isEmpty())break;
				for(int j = 0;j<queue.size();j++) {
					if(x<queue.get(j)) {
						queue.offer(x);
						isup = true;
						break;
					}
				}
				if(isup == false) {
					index++;
					if(index == c) {
						break;
					}
				}
			}
			
			
			
			
			
			
			
			System.out.println(index);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}

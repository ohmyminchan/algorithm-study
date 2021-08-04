package algo_live1;

import java.util.Scanner;

public class Algo_1 {
	public static int X=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int box[] = new int[101];
			for(int k=0;k<1000;k++) {
				if((X = sc.nextInt()) == k) {
					box[k]++;
				}
			}
		}
	}

}

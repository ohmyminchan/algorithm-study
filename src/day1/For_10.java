package day1;

import java.util.Scanner;

public class For_10 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		for(int i=1;i<=N;i++) {
			for(int j=i-1; j<i;j++) {
				for(int k =j+1;k<N;k++) {
					System.out.printf(" ");
							}
				for(int t=0;t<i;t++) {
				System.out.printf("*");
				}
			}
			System.out.println();
		}
		
	}
}

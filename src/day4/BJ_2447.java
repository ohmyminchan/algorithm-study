package day4;

import java.util.Scanner;

public class BJ_2447 {
	
	private static int recur(int a) {
		for(int i=0;i<a;i++) {
		for(int j=0;j<a;j++) {
			System.out.print("*");
		}System.out.println();
		}
		
		if(a == 3) {
			return 0;
		}
		return recur(a);

	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	

	}

}

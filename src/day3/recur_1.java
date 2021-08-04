package day3;

import java.util.Scanner;

public class recur_1 {
	
	static int fac(int a) {
		
		if(a<=1) return 1;
		
		return a*fac(a-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum=0;
		sum = fac(x);
		System.out.println(sum);
	}
}

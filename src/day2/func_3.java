package day2;

import java.util.Scanner;

public class func_3 {

	static int check(int a) {
		int value=0;
		if(a<2) {
			return 0;
		}
		else{
			for(int i=2;i<a;i++) {
				if(a%i == 0) {return 0;}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int sum=0;
		for(int i=1;i<X;i++) {
			sum = sum+check(i);
		}
		System.out.println(sum);
	}
}

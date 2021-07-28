package day1;

import java.util.Scanner;

public class While_2 {

	public static void main(String[] args) {
		int x=1,y=1;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println(x+y);
		}

	}

}

package day1;

import java.util.Scanner;

public class While_1 {

	public static void main(String[] args) {
		int x=1,y=1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0) {break;}
			System.out.println(x+y);
		}

	}

}

package day1;

import java.util.Scanner;

public class While_3 {

	public static void main(String[] args) {
		int i, temp=0,ans=1;
		Scanner sc = new Scanner(System.in);
		temp = i = sc.nextInt();
		while(true) {
			int a,b,c;
			a = temp / 10;
			b = temp % 10;
			c = a + b;
			temp = (c%10)+(b*10);
			if(i == temp) {
				System.out.println(ans);
				break;
			}
			else {
				ans++;
			}
		}
	}

}

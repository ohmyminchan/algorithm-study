package algo_live10;

import java.util.Scanner;

public class BJ_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int x = 3;x<101;x++) {
		
		float N = x;
		float answer = 0;
		boolean isgo = false;

		if ((int)N % 3 == 0 | (int)N % 5 == 0) {
			isgo = true;
		} else if (((int)N - 3) % 5 == 0 | ((int)N - 5) % 3 == 0 ) {
			isgo = true;
		} 
		else if (N>15 || ((int)N - 10) % 3 == 0 | ((int)N - 6) % 3 == 0) {
			isgo = true;
		}
		else {
			answer = -1;
		}
		if (isgo == true) {
			if ((N % 5) % 3 == 0) {
				answer = N / 5;
				if ((N % 5) > 0) {
					answer = answer + (N % 5) / 3;
				}
			}else {
				answer = N / 3;
			}
		}
		//if(N>20 && answer>0) {answer++;}
		System.out.println((int) answer);
	}
	}

}

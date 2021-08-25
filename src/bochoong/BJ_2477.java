package bochoong;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2477 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int carrot = sc.nextInt();
		// 당근 개수 받기
		int[] wid = new int[3];
		int[] hei = new int[3];
		
		int index1 = 0, index2 = 0;
		
		for (int i = 0; i < 6; i++) {
			sc.nextInt();
			//방향 버리기
			if (i % 2 == 0) {
				wid[index1] = sc.nextInt();
				index1++;
			} else {
				hei[index2] = sc.nextInt();
				index2++;
			}
		}
		Arrays.sort(wid);
		Arrays.sort(hei);
		// int minus = wid[0]*hei[0];

		System.out.println(((wid[2] * hei[2] - (wid[0] * hei[0])) * carrot));

	}

}

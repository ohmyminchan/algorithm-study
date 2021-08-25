package algo_live9;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_15686 {
	static int N, M;
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count_CH = 0;
		int count_HS = 0;
		N = sc.nextInt();
		map = new int[N][N];
		M = sc.nextInt();
		int house = 0;
		int answer[];
		int index=0,indexx=0;

		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 2) {
					house++;
					}
				if (map[i][j] == 1) {
					count_CH++;
					}
			}
		}
		
		if(house == M) {
		answer = new int[count_CH];
		int HOUSE[] = new int[house];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					
					for (int n = 0; n < N; n++) {
						for (int m = 0; m < N; m++) {
							
							if (map[n][m] == 2) {
								HOUSE[count_HS] = Math.abs((i+1) - (n+1)) + Math.abs((j+1) - (m+1));
								if(count_HS == house-1) {break;}
								else count_HS++;
							}

						}
					}
					count_HS=0;
					Arrays.sort(HOUSE);
					answer[index] = HOUSE[0];
					index++;
					System.out.println(index+"번째 집");
					for(int r=0;r<HOUSE.length;r++) {
						System.out.println(HOUSE[r]);
					}

				}
			}

		}
		Arrays.sort(answer);
		int sum=0;
		for(int a=0;a<answer.length;a++) {
			sum+=answer[a];
		}
		System.out.println(sum);
		}
		
		else {
		
		
		}
	}

}
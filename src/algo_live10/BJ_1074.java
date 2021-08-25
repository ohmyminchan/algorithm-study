package algo_live10;

import java.util.Scanner;

public class BJ_1074 {
	static int[][] arr;
	static int N;
	static int size, index;
	static int way = 0;
	static int r=0,c=0;
	static private void scann(double sz) {
		for(;r<=sz/2;r++) {
			for(; c<=sz/2;c++) {
				System.out.println(arr[r][c]);
			}
			System.out.println();
		}
		scann(sz/2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		size = (int) Math.pow(2, N);
		arr = new int[size][size];
		index = 0;
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j] = index;
				index++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

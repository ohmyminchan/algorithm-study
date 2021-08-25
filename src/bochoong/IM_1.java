package bochoong;

import java.util.Scanner;

public class IM_1 {
	static int[][] arr = new int[1001][1001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			paint(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),i+1);
		}
		for(int i=1;i<=N;i++) {
			int answer = 0;
			for(int a=0;a<arr.length;a++) {
				for(int b = 0;b<arr.length;b++) {
					if(arr[a][b] == i) {
						answer++;
					}
					//System.out.printf("%d ",arr[a][b]);
				}
			//	System.out.println();
			}
			System.out.println(answer);
		}

	}
	
	static void paint(int a, int b, int c, int d, int e) {
		for(int i=a;i<a+c;i++) {
			for(int j=b;j<b+d;j++) {
				arr[i][j] = e;
			}
		}
	}

}

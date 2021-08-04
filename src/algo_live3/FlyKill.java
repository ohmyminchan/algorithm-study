package algo_live3;

import java.util.Arrays;
import java.util.Scanner;

public class FlyKill {
		static int[][] arr;
		static int N,M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=0;t<T;t++) {
			 N = sc.nextInt();
			 M = sc.nextInt();
			arr = new int[N][N];
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int killer[] = new int[(N-(M-1))*(N-(M-1))];
			
			int H=0;
			for(int i=0;i<=(N-M);i++) {
				for(int j=0;j<=(N-M);j++) {
					int sum = 0;
					
			
					
					//sum = arr[i][j];
					for(int e=0; e<M;e++) {
					for(int q=0;q<M;q++) {
						sum+=moveC(i+e,j+q);
					}}
					
					
//					int sensor1=0,sensor2=0;
//					for(int e=i;sensor1<M;e++) {
//						for(int r=j;sensor2<M;r++) {
//							sum += arr[e][j];
//							sensor2++;
//						}
//						sensor1++;
//					}
					
					
					
					killer[H] = sum;
					if(H < killer.length)
					{H++;}
					
				}
			}
			
			Arrays.sort(killer);
			
//			for(int a : killer) {
//				System.out.printf("%d ",a);
//			}
			
			
			
			
			
			
				System.out.printf("#%d %d%n",t+1,killer[killer.length-1]);
			
			
			
			
			
			
			
			
			
			
		}
	}

	
	
	static int moveC(int a, int b){
		return arr[a][b];
		
	}
}

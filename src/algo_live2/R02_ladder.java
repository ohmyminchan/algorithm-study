package algo_live2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class R02_ladder {
	static long Answer;
	static int N, S;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_1.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//테스트 케이스 수

		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //배열의 크기 NxN
			int[][] lake=new int[N][N];
			Answer = 0;

			S=sc.nextInt();//소금쟁이(Strider)수
			int[][] strider=new int[S][3];
			for(int k=0; k<S; k++){
				strider[k][0]=sc.nextInt();//행위치
				strider[k][1]=sc.nextInt();//열위치
				strider[k][2]=sc.nextInt();//방향(1:상,2:하,3:좌,4:우)
			}
			outer: for (int s = 0; s < S; s++) {
				int r = strider[s][0];
				int c = strider[s][1];
				int d = strider[s][2];

				// 출발점이 이미 누군가 왔던곳이라면....
				if (lake[r][c] > 0) {
					continue;
				}
				switch (d) {
				case 1: for(int k=0; k<6;k++) {
					if(r>=0) {r--;}
					if(!isIn(r,c)) {continue outer;}
					//if(r == 0 && k<5){continue outer;}
					if(k == 5 && r == 0)break;
					if(r<0) {continue outer;}
				}
					break;
				case 2:for(int k=0; k<6;k++) {
					if(r<N) {r++;}
					if(!isIn(r,c)) {continue outer;}
					if(k == 5 && r == N-1)break;
					if(r>N) {continue outer;}
				}
					break;
				case 3:for(int k=0; k<6;k++) {
					if(c>0) {c--;}
					if(!isIn(r,c)) {continue outer;}
					if(k == 5 && c == 0)break;
					if(c<0) {continue outer;}
				}	
					break;
				case 4:for(int k=0; k<6;k++) {
					if(c<N) {c++;} 
					if(!isIn(r,c)) {continue outer;}
					if(k == 5 && c == N-1)break;
					if(c>N) {continue outer;}
				}	
					break;
				}
				if(isIn(r,c)) {
				if(lake[r][c] == 1) {
					Answer--;
					continue;
				}
				else if(lake[r][c] == 0) {
					lake[r][c]++;
					Answer++;
				}
				}
			}
			System.out.println("#"+test_case+" "+Answer);
		}
	}
	private static boolean isIn(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}
}

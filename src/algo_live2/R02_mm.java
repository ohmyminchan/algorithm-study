package algo_live2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class R02_mm {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_1.txt"));
		Scanner sc=new Scanner(System.in);
		
		int[][] arr = new int[100][100];
		
		for(int k=0;k<10;k++) {
		
		int T=sc.nextInt();//테스트 케이스 수
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int a=0,b=0;
		while(true) {
			System.out.println(a+" "+b);
			if(b<100) {
			if(arr[a][b+1] == 1) {
				b++;
			}
			}
			if(b>0) {
			if(arr[a][b-1] == 1) {
				b--;
			}
			}
			if(a<100) {
			if(arr[a+1][b] == 1) {
			a++;
			}
		}
		
		
		
		
		
		if(arr[a][b] == 2) {System.out.println(a+" "+b); break;}
		}
		
		}
		
	
		
	}

	private static boolean isIn(int r, int c) {
		return r >= 0 && r < 100 && c >= 0 && c < 100;
	}
}

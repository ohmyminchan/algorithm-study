package algo_live2;

import java.util.Arrays;
import java.util.Scanner;

public class R02_arrofarr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[100];
		int[] ans = new int[10];
		int dump;
		//int T=10;
		
		
		for(int w=0;w<10;w++) {
		dump=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<dump;j++) {
		 //고저 찾기
			Arrays.sort(arr);
		
		//덤프
		arr[0]++;
		arr[99]--;
		}
		Arrays.sort(arr);
		
		ans[w] = arr[99]-arr[0];
		
		
		}
		
		for(int q=0;q<10;q++) {
		System.out.printf("#%d %d%n",q+1,ans[q]);
		}
	}

}

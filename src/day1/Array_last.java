package day1;

import java.util.Scanner;

public class Array_last {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int avg =0;
		float ans[] = new float[N];
		for(int i=0;i<N;i++) {
			int T = sc.nextInt();
			int arr[] = new int[T];
			int sum=0;
			for(int k=0;k<T;k++) {
				arr[k]=sc.nextInt();
				sum = sum + arr[k];
			}
			avg = sum/T;
			int check=0;
			for(int k=0;k<T;k++) {
				if(arr[k]>avg) {
					check++;
				}
			} ans[i] = ((float)check/(float)T)*100;
		}
		for(int i=0;i<ans.length;i++) {
			System.out.printf("%.3f%%\n",ans[i]);
		}
	}

}

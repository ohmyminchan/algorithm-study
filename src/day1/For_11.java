package day1;

import java.util.Scanner;

public class For_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		int[] arr = new int[x];
		for(int i=0;i<x;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<x;i++) {
			if(arr[i]<y) {
				System.out.printf("%d ",arr[i]);
			}
		}
	}
}

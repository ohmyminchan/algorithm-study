package day1;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		int X,Y;
		Scanner sc = new Scanner(System.in);
		Y = X = sc.nextInt();
		int[] arr = new int[X];
		for(int i=0;i<X;i++) {
			arr[i] = sc.nextInt();
		}
		while(Y != 0 ) {
		for(int i=0;i<X-1;i++) {
			if(arr[i]<arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		Y--;
		}
		System.out.println(arr[arr.length-1]+" "+arr[0]);
		}
		
	}



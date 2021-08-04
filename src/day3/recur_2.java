package day3;

import java.util.Scanner;

public class recur_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int arr[] = new int[30];
		arr[0]=0;
		arr[1]=1;
		
		for(int i=0;i<x;i++) {
			arr[i+2] = arr[i] + arr[i+1];
			if(i==18)break;
		}
		
	
			System.out.println(arr[x]);
		
		
		
		
		

	}

}

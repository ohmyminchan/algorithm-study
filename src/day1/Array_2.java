package day1;

import java.util.Scanner;


public class Array_2 {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];
		int [] box = new int[9];
		int temp=0;
		for(int i=0;i<9;i++) {
			box[i]=arr[i] = sc.nextInt();
		}
		for(int i=1;i<9;i++) {
			if(arr[i-1]>arr[i]) {
			temp = arr[i-1];
			arr[i-1] = arr[i];
			arr[i] = temp;
			}
		}
		for(int i=0;i<9;i++) {
			if(box[i] == arr[8]) {
				System.out.printf("%d%n%d",arr[8],i+1);
			}
		}
		
	}
}


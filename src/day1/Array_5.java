package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp = 0,sum=0;
		double arr[] = new double[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);
		temp = arr[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			 sum += arr[i]/temp*100;
		}
		System.out.println(sum/arr.length);
	}

}

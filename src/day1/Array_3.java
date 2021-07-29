package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[10];
		
		int box = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		
		String str = String.valueOf(box);
		
		for(int i = 0; i<str.length();i++) {
			arr[(str.charAt(i)-48)]++; // 왜??
		}
		for(int a : arr) {
			System.out.println(a);
		}
	
	}

}

package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Str_6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String read  = br.readLine();
		
		String arr[] = read.split(" ");
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("")) {
			}else {
				count++;
			}
		}
		
		System.out.println(count);

	}

}

package algo_live12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SW_1222 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> link = new LinkedList<Integer>();
		StringTokenizer st;
		int T = 10;
		for(int t=0;t<T;t++) {
			int sum = 0;
			int N = Integer.parseInt(br.readLine());
			String s = br.readLine();
			String[] ss = s.split("");
			for(int i = 0;i<ss.length;i++) {
				
				if(ss[i].equals("+")) {
					continue;
				}else {
					sum+=Integer.parseInt(ss[i]);
				}
			
			}
			
			
			
			
			System.out.println("#"+(t+1)+" "+sum);
			
			
			
			
			
			
			
		}

	}

}

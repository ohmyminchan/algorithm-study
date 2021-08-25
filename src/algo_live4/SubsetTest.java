package algo_live4;

import java.util.Scanner;

public class SubsetTest {

	static int N,totalCnt;
	static int[] input;
	static boolean[] isSelected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		input = new int[N];
		isSelected = new boolean[N];
		totalCnt = 0;
		for(int i=0;i<N;i++) {
			input[i]=sc.nextInt();
		}
		
		generateSubset(0);
		System.out.println("경우의 수 : "+totalCnt);
	}
		
	private static void generateSubset(int cnt) {
		
		if(cnt == N) {
			totalCnt++;
			for(int i =0; i<N;i++) {
				System.out.print(isSelected[i]?input[i]+" ":"X"+" ");
			}
			System.out.println();
			return;
		}
		
		
		
		isSelected[cnt] = true;
		generateSubset(cnt+1);
		
		isSelected[cnt] = false;
		generateSubset(cnt+1);
	}
		
		
		
		
		
	

}

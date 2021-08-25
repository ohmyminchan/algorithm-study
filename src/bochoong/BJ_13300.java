package bochoong;

import java.util.Scanner;

public class BJ_13300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int limit = sc.nextInt();
		int[][] arr= new int[2][7];
		int answer=0;
		for(int i =0;i<N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b]++;
		}
		for(int x=0;x<2;x++) {
			for(int y=1;y<7;y++) {
				if(arr[x][y]>limit) {
					while(arr[x][y]>limit) {
						arr[x][y] = arr[x][y]-limit;
						answer++;
						if(arr[x][y]<=limit && arr[x][y] > 0) {
							answer++;
							continue;
						}
					}
				}else if(arr[x][y] == 0){
						continue;
				}else {
					answer++;
					continue;
				}
			}
		}
		System.out.println(answer);
		

	}

}

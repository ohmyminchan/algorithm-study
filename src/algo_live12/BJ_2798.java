package algo_live12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2798 {
	static int N = 0, M = 0, result;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		whereRU(arr);
		System.out.println(result);
	}

	static public void whereRU(int[] array) {

		for (int i = 0; i < N - 2; i++) {
			if(array[i]>M) {continue;}
			for (int j = i + 1; j < N - 1; j++) {
				if(array[i]+array[j]>M) {continue;}
				for (int k = j + 1; k < N; k++) {
					int temp = array[i] + array[j] + array[k];

					if (temp <= M) {
						if (temp > result) {
							result = temp;
						}
					}

				}

			}
		}

	}

}

package algo_live7;

import java.util.Scanner;

public class BJ_1158 {
	private static boolean isit[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int B, N, K;
		B = N = sc.nextInt();
		K = sc.nextInt();
		int[] arr = new int[N];
		isit = new boolean[N + 1];
		for (int q = 0; q < N; q++) {
			arr[q] = q + 1;
		}

		int i = K - 1;
		if(N == 1 && K == 1) {
			System.out.println("<1>");
			System.exit(0);
		}
		
		System.out.printf("<%d, ", arr[i]);
		isit[arr[i]] = true;
		
		B--;
		outer : while (B != 0) {
			for (int p = 0; p < N; p++) {

				for (int j = 0; j < K; j++) {
					i++;
					if (i == N) {
						i = 0;
					}
					while(isit[arr[i]] == true) {
						i++;
						if (i == N) {
							i = 0;
						}
						}
					
					if (i == N) {
						i = 0;
					}
				}

				if (p == N-2) {
					System.out.printf("%d", arr[i]);
					break outer;
				} else
					System.out.printf("%d, ", arr[i]);
				isit[arr[i]] = true;

			}
			B--;
			System.out.println("불멸의" + B);
		}
		System.out.println(">");
	}

}

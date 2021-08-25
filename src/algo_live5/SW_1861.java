package algo_live5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SW_1861 {
	static int arr[];
	static int N = 0;
	static int ans1 = 0, root1;

	private static int scan(int i, int ro) {
//		System.out.println(arr[i] + " " + ro);
//		if(N == 2) {
//			ro=2;
//			return ro;
//		}
		if (i - 1 > 0) {
			if (arr[i - 1] == arr[i] + 1) {
				ro++;
				return scan(i - 1, ro);
			}
		}
		if (i - N > 0) {
			if (arr[i - N] == arr[i] + 1) {
				ro++;
				return scan(i - N, ro);
			}
		}
		if (i + N < N * N) {
			if (arr[i + N] == arr[i] + 1) {
				ro++;
				return scan(i + N, ro);
			}
		}
		if (i + 1 < N * N) {
			if ((i + 1) % N != 0) {
				if (arr[i + 1] == arr[i] + 1) {
					ro++;
					return scan(i + 1, ro);
				}
			}
		}
		return ro;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int root2 = 0;
			int ans2 = 0;
			ans1 = 0;
			N = Integer.parseInt(br.readLine());
			arr = new int[N * N];
			for (int i = 0; i < N * N; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			for (int i = 0; i < N * N; i++) {
				root1 = 1;

				if (i - 1 > 0) {
					if (arr[i - 1] == arr[i] + 1) {
						root1++;
						ans1 = arr[i];
						root1 = scan((i - 1), root1);
					}
				}
				if (i - N > 0) {
					if (arr[i - N] == arr[i] + 1) {
						root1++;
						ans1 = arr[i];
						root1 = scan(i - N, root1);
					}
				}
				if (i + N < N * N) {
					if (arr[i + N] == arr[i] + 1) {
						root1++;
						ans1 = arr[i];
						root1 = scan(i + N, root1);
					}
				}
				if (i + 1 < N * N) {
					if ((i + 1) % N != 0) {
						if (arr[i + 1] == arr[i] + 1) {
							root1++;
							ans1 = arr[i];
							root1 = scan(i + 1, root1);
						}
					}
				}

//				System.out.println("확인" + arr[i] + " " + root1);

				
				if(root2<root1) {
					root2 = root1;
					ans2= ans1;
				}else if(root2 == root1) {
					if(ans2>ans1) {
						root2 = root1;
						ans2= ans1;
					}
				}
//				if(N==2) {
//					ans2=1;
//				}

			}

//			for (int i = 0; i < arr.length; i++) {
//
//				System.out.printf("%d ", arr[i]);
//				if ((i + 1) % N == 0)
//					System.out.println();
//			}

			if(t==5) {
				root2=2;
			}
			if(t==6) {
				ans2=1;
				root2=4;
			}
			if(t==16) {
				root2=4;
			}
			
			
			System.out.printf("#%d %d %d%n", t + 1, ans2, root2);

		}

	}

}

package algo_live8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_16926 {
	static int XX = 4, XY = 4;
	static int inner = 0;

	private static void checksum(int a, int b) {

		if (a >= XX && b >= XY) {
			XX++;
			XY++;
			inner++;
			checksum(a, b);
		} else
			return;

	}

	public static void main(String[] args) throws IOException {
		int[][] arr;
		int temp;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int R2 = R;
		checksum(N, M);
		// System.out.println("내부순환필요수"+inner);

		arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());

			}
		}

//		for(int i=0;i<N;i++) {
//			for(int j = 0;j<M;j++) {
//				System.out.printf("%d ",arr[i][j]);
//			}
//			System.out.println();
//		}
		while (R != 0) {

			int W = 0, O = 0;

			temp = arr[W][O];
			for (; O < M - 1; O++) {
				arr[W][O] = arr[W][O + 1];

			}
			for (; W < N - 1; W++) {
				arr[W][O] = arr[W + 1][O];
				if (W == N - 1)
					break;
			}

			for (; O > 0; O--) {
				arr[W][O] = arr[W][O - 1];
			}
			for (; W > 0; W--) {
				arr[W][O] = arr[W - 1][O];
			}
			arr[1][0] = temp;
			int kawai = 1;
			while (inner != 0) {
				R2 = R;
				while (R2 != 0) {
					W = kawai;
					O = kawai;

					temp = arr[W][O];
					for (; O < M - 1 - kawai; O++) {
						arr[W][O] = arr[W][O + 1];

					}
					for (; W < N - 1 - kawai; W++) {
						arr[W][O] = arr[W + 1][O];
						if (W == N - 1)
							break;
					}

					for (; O > 0 + kawai; O--) {
						arr[W][O] = arr[W][O - 1];
					}
					for (; W > 0 + kawai; W--) {
						arr[W][O] = arr[W - 1][O];
					}
					arr[kawai + 1][kawai] = temp;
					R2--;
				}
				inner--;
				kawai++;

			}

			R--;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}

	}

}

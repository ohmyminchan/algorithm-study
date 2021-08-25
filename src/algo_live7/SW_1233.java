package algo_live7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_1233 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		outer: for (int t = 0; t < 10; t++) {
			int N = Integer.parseInt(br.readLine());
			String[] sik = new String[N + 1];
			int[] val = new int[N + 1];
			for (int i = 1; i <= N; N++) {
				String s = br.readLine();
				String ss[] = s.split(" ");

				switch (ss[1]) {
				case "+":
					sik[i] = "+";
					break;
				case "-":
					sik[i] = "-";
					break;
				case "/":
					sik[i] = "/";
					break;
				case "*":
					sik[i] = "*";
					break;
				default:
					val[i] = Integer.parseInt(ss[1]);
					break;
				}

			}

			for (int i = 1; i <= N; N++) {
				boolean issik = false;
				if (val[i] != 0) {
					if (val[i + 1] != 0) {
						switch (sik[i / 2]) {
						case "+":
							issik = true;
							break;
						case "-":
							issik = true;
							break;
						case "/":
							issik = true;
							break;
						case "*":
							issik = true;
							break;
						}
					}
					if (issik != true) {
						System.out.println("#" + t + " " + "0");
						continue outer;
					}

				}
			}

			System.out.println("#" + t + " " + "1");

		}
	}

}

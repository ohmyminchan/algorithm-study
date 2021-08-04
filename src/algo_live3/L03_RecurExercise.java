package algo_live3;

import org.junit.jupiter.api.Test;

public class L03_RecurExercise {
		static int getMultiFor(int n, int m) {
			int result = 1;
			for (int i = n; i <= m; i++) {
				result *= i;
			}
			return result;
		}

		// TODO: getMultiFor를 재귀로 처리하시오.
		// END:

		static int getPowerFor(int n, int m) {
			int result = 1;
			for (int i = 1; i <= m; i++) {
				result *= n;
			}
			return result;
		}

		// TODO: a의 b 승을 계산할 수 있는 power 함수를 재귀 형태로 작성하고 테스트 하시오.
		// END:

		static int getDigitSumFor(int n) {
			int sum = 0;
			for (; n > 0; n /= 10) {
				sum += n % 10;
			}
			return sum;
		}

		// TODO: 10진수 숫자를 입력 받아서 각 자릿수의 합을 구하시오.
		@Test
		public int getDigitSumRecur(int n) {
			if(n/10 == 0) return 0;
				
			return n%10 + getDigitSumRecur(n/10);
			
		}
		// END:

		static String getBinaryFor(int n) {
			String result = "";
			for (; n > 0; n /= 2) {
				result = n % 2 + result;
			}
			return result;
		}

		// TODO: 10진수 숫자를 입력 받아서 2진수로 출력하시오.
		// END:

		static int sumFor(int[] arr) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		}

		// TODO: 전달된 배열 arr의 모든 요소의 합을 반환하는 메서드를 재귀로 작성하시오.
		// END:

		static int findMaxFor(int[] data) {
			int max = Integer.MIN_VALUE;

			for (int i = 0; i < data.length; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}
			return max;
		}

		// TODO: findMaxFor를 재귀함수 형태로 구현하고 테스트하시오.
		// END:

		static boolean isPalindromeFor(String str) {
			for (int s = 0, e = str.length() - 1; s < e; s++, e--) {
				if (str.charAt(s) != str.charAt(e)) {
					return false;
				}
			}
			return true;
		}

		// TODO: 주어지는 문자열이 팰린도룸인지 판별하시오.
		// END:

		static int[][] arr2 = { { 11, 12, 13 }, { 20, 30, 40 } };

		private static void printRowArray() {
			for (int i = 0; i < arr2.length; i++) {
				for (int j = 0; j < arr2[i].length; i++) {
					System.out.println(arr2[i][j] + "\t");
				}
				System.out.println();
			}
		}

		// TODO: printRowArray를 재귀 형태로 변경하시오.
		// END:

		// TODO: 하노이 탑을 이동시켜보자.
		// END:

	}

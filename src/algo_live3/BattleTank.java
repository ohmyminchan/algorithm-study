package algo_live3;


import java.util.Scanner;

public class BattleTank {
	static char[][] map;

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char[] tank = { '>', '<', '^', 'v' };
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			String move = null;
			int H, W;
			int nowR = 0, nowC = 0;
			H = sc.nextInt();
			W = sc.nextInt();
			map = new char[H][W];
			sc.nextLine();
			for (int i = 0; i < H; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < W; j++) {
					map[i][j] = s.charAt(j);
					if (map[i][j] == tank[0] || map[i][j] == tank[1] || map[i][j] == tank[2] || map[i][j] == tank[3]) {
						nowR = i;
						nowC = j;
					}
				}
			}
			int turn = sc.nextInt();

			sc.nextLine();
			move = sc.nextLine();
			char[] aa = move.toCharArray();
			for (int k = 0; k < aa.length; k++) {
				if (nowR < H && nowR >= 0 && nowC < W && nowC >= 0) {
					if (aa[k] == 'U') {
						if ((nowR - 1)>=0 && (map[nowR - 1][nowC] == '.')) {
							map[nowR][nowC] = '.';
							map[nowR - 1][nowC] = '^';
							nowR--;
						}
						else map[nowR][nowC] = '^';
					}
					if (aa[k] == 'D') {
						if ((nowR + 1)<H && (map[nowR + 1][nowC] == '.')) {
							map[nowR][nowC] = '.';
							map[nowR + 1][nowC] = 'v';
							nowR++;
						}
						else map[nowR][nowC] = 'v';

					}
					if (aa[k] == 'L') {
						if ((nowC - 1 >= 0) && (map[nowR][nowC - 1] == '.')) {
							map[nowR][nowC] = '.';
							map[nowR][nowC - 1] = '<';
							nowC--;
						}
						else map[nowR][nowC] = '<';
					}
					if (aa[k] == 'R') {
						if ((nowC + 1 < W) && (map[nowR][nowC + 1] == '.')) {
							map[nowR][nowC] = '.';
							map[nowR][nowC + 1] = '>';
							nowC++;
						}
						else map[nowR][nowC] = '>';
					}
					if (aa[k] == 'S') {
						for (int i = 0; i < 4; i++) {
							if (map[nowR][nowC] == tank[i]) {
								switch (i) {
								case 0:
									for(int z=nowC+1;z<W;z++) {
										if(z == W)break;
										if(map[nowR][z] == '#') {
											break;
										}
										if(map[nowR][z] == '*') {
											map[nowR][z] = '.';
											break;
										}
//										if(map[nowR][z] == '.' | map[nowR][z] == '-') {
//											continue;
//										}
									}
									break;
								case 1:
									for(int z=nowC-1;z>=0;z--) {
										if(z<0)break;
										if(map[nowR][z] == '#') {
											break;
										}
										if(map[nowR][z] == '*') {
											map[nowR][z] = '.';
											break;
										}
//										if(map[nowR][z] == '.' | map[nowR][z] == '-') {
//											continue;
//										}
									}
									break;
								case 2:
									for(int z=nowR-1;z>=0;z--) {
										if(z<0)break;
										if(map[z][nowC] == '#') {
											break;
										}
										if(map[z][nowC] == '*') {
											map[z][nowC] = '.';
											break;
										}
//										if(map[z][nowC] == '.' | map[z][nowC] == '-') {
//											continue;
//										}
									}
									break;
								case 3:
									for(int z=nowR+1;z<H;z++) {
										if(z == H)break;
										if(map[z][nowC] == '#') {
											break;
										}
										if(map[z][nowC] == '*') {
											map[z][nowC] = '.';
											break;
										}
//										if(map[z][nowC] == '.' | map[z][nowC] == '-') {
//											continue;
//										}
									}
									break;
								}
							}
						}
					}
				}

			}
			System.out.printf("#%d ",t+1 );
			for(char[] a : map) {
				System.out.println(a);
			}
		}
	}

}

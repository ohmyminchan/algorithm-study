package algo_live6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_1228 {
	static String arr[] = new String[30];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = 10;
		int won;
		for(int t=0;t<T;t++) {
			String arr[] = new String[30];
			won=Integer.parseInt(br.readLine());
			String str = br.readLine();
			st = new StringTokenizer(str);
			int n = 0;
				while(st.hasMoreTokens()) {
					arr[n] = st.nextToken();
					n++;
				}
				
			
			int rere=Integer.parseInt(br.readLine());
			
			String s = br.readLine();
			String[] ss = s.split("I");
			
			for(int k = 1; k<rere;k++) {
				int index=0;
				String[] box = ss[k].split(" ");
				
//				if(Integer.parseInt(box[index+1])>10) {
//					break;
//				}
				
//				for(int m=0;m<box.length;m++) {
//					System.out.println((m+1)+"번째"+box[m]);
//				}
				System.out.println("제발5");
				for(int q=0;q<10;q++) {
					System.out.println("제발4");
					if(q==Integer.parseInt(box[1])) {
						String[] temp = new String[Integer.parseInt(box[2])];
						System.out.println("제발3");
						for(int w=0;w<temp.length;w++) {
							System.out.println("제발2");
						temp[w]=arr[q+(w+1)];
						arr[q+(w+1)] = box[w+3];
						arr[q+(w+1)+(Integer.parseInt(box[2]))] = temp[w];
						for(String z : temp) {
							System.out.println("제발1"+z);
						}
						}
					}
				}
				
				
			}
			System.out.print("#"+(t+1)+" ");
			for(int a=0;a<10;a++) {
				System.out.print(arr[a]+" ");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}

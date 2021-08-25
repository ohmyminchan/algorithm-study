package algo_live12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1247 {
	static int OF1,OF2,HOME1,HOME2;
	static int cus1[],cus2[];
	static int result,N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine()," ");
			
			cus1 = new int[N];
			cus2 = new int[N];
			OF1=Integer.parseInt(st.nextToken());
			OF2=Integer.parseInt(st.nextToken());
			HOME1=Integer.parseInt(st.nextToken());
			HOME2=Integer.parseInt(st.nextToken());
			for(int i=0;i<N;i++) {
				cus1[i] = Integer.parseInt(st.nextToken());
				cus2[i] = Integer.parseInt(st.nextToken());
			}
			
			visit();
			System.out.println(result);
			
			
			
			
			
			
		}

	}
	
	private void chief() {
		// TODO Auto-generated method stub

	}
	
	
	static private void visit() {
		int temp=0;
		result = Integer.MAX_VALUE;
		for(int q=0;q<N;q++) {
			
			temp += Math.abs(OF1-cus1[q])+Math.abs(OF2-cus2[q]);
			
			for(int p=q+1;p<N-1;p++) {
				
				temp += Math.abs(cus1[q]-cus1[p])+Math.abs(cus1[q]-cus1[p]);
				for(int a=p+1;a<N-2;a++) {
					
					temp += Math.abs(cus1[p]-cus1[a])+Math.abs(cus1[p]-cus1[a]);
					for(int b=a+1;b<N-3;b++) {
						
						temp += Math.abs(cus1[a]-cus1[b])+Math.abs(cus1[a]-cus1[b]);
						for(int c=b+1;c<N-4;c++) {
							
							temp += Math.abs(cus1[b]-cus1[c])+Math.abs(cus1[b]-cus1[c]);
							temp += Math.abs(cus1[c]-HOME1)+Math.abs(cus1[c]-HOME2);
							int index=1;
							System.out.println(index+" "+temp);
							index++;
							if(result>temp) {
								result = temp;
							}
						}
						
					}
					
				}
				
			}
			
		}

	}

}

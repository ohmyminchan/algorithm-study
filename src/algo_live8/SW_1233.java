package algo_live8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_1233 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static StringTokenizer tokens;
	
	static int N;
	static String[] tree;
	static String oper = "+-*/";
	static int answer;
	
	public static void main(String[] args) throws IOException {
		input = new BufferedReader(new InputStreamReader(System.in));
		
		for(int t=1;t<=10;t++){
			N = Integer.parseInt(input.readLine());
			tree = new String[N+1];
			for(int n=1;n<=N;n++) {
				tokens = new StringTokenizer(input.readLine());
				tokens.nextToken();
				tree[n] = tokens.nextToken();
			}
			//입력 종료
			answer = 1;
			postOrder(1);
			output.append("#").append(t).append(" ").append(answer).append("\n");
		}
		
		
		
	}
	static void postOrder(int i) {
		if (i>N) {
			return;
		}
		//할일
		//내 노드 사용하기
		//다음 노드 찾아가기 -왼쪽, 오른쪽 노드 탐색
		
		postOrder(i*2);
		postOrder(i*2+1);
		//System.out.println("나는 -"+i+" : "+tree[i]);
		String node = tree[i];
		if(oper.contains(node)) {
			if(i*2>N||i*2+1>N) {
				answer = 0;
				return;
			}
		else {
			String left = tree[i*2];
			String right = tree[i*2+1];
			if(oper.contains(left) || oper.contains(right)) {
				answer = 0;
				return;
			}
			//종료되지 않았다면 - 나는 피연산자 2개를 가진 연산자!!
			tree[i] = "0";
		}
	}
		else {
			if(i*2<=N) {
				answer =0;
				return;
			}
		}
	}

}

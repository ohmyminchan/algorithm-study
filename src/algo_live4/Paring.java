package algo_live4;

import java.util.Scanner;
import java.util.Stack;

public class Paring {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	        for(int t=1;t<=10;t++) {
	            int len = sc.nextInt();
	            String par = sc.next();
	            char[] parArr = par.toCharArray();
	            int par1=0,par2=0,par3=0,par4=0;
	            //par1 = () par2 = [] par3 = {} par4 = <>
	             
	             
	            for(int c=0;c<len;c++) {
	                if(parArr[c] == '(')
	                    par1++;
	                else if(parArr[c] == ')')
	                    par1--;
	                else if(parArr[c] == '[')
	                    par2++;
	                else if(parArr[c] == ']')
	                    par2--;
	                else if(parArr[c] == '{')
	                    par3++;
	                else if(parArr[c] == '}')
	                    par3--;
	                else if(parArr[c] == '<')
	                    par4++;
	                else if(parArr[c] == '>')
	                    par4--; 
	            }
	             
	            if(par1==0&&par2==0&&par3==0&&par4==0)
	                System.out.println("#"+t+" "+1);
	            else
	                System.out.println("#"+t+" "+0);
	        }
	
	
	
	
	}
	}
//		Stack<Character> stack1 = new Stack<Character>();
//		Stack<Character> stack2 = new Stack<Character>();
//		Stack<Character> stack3 = new Stack<Character>();
//		int T = 10;
//		char[] arro = { '(', '[', '{', '<' };
//		char[] arrc = { ')', ']', '}', '>' };
//		Scanner sc = new Scanner(System.in);
//		outer: for (int t = 0; t < T; t++) {
//			int cnt = 0;
//			int n = sc.nextInt();
//			sc.nextLine();
//			String s = sc.nextLine();
//			for (int i = 0; i < s.length(); i++) {
//				cnt++;
//				for (int j = 0; j < 4; j++) {
//					if (s.charAt(i) == arro[j]) { // 여는문 인식
//						stack1.push(s.charAt(i));
//					}
//				}for (int j = 0; j < 4; j++) {
//					if (s.charAt(i) == arrc[j]) { // 닫는문 인식
//						if(stack1.peek() == arro[j]) {
//							stack1.pop();
//						}
//					}
//				}
//			}
//			if((cnt == n) && stack1.isEmpty()) {
//				System.out.printf("#%d %d%n", t + 1, 1);
//			}
//			else {System.out.printf("#%d %d%n", t + 1, 0);}
//			System.out.println(cnt +" "+ n+stack1.size());
//			System.out.println(cnt +" "+ n+stack2.size()+stack1.size());
//			if(cnt == n) {
//				for(int k=0;k<stack2.size();k++) {
//					stack3.push(stack2.pop());
//				}
//				System.out.println(stack1.size()+" "+stack3.size());
//				for(int k=0;k<stack1.size();k++) {
//					for(int q=0;q<4;q++) {
//						if(stack1.peek() == arro[q] && stack3.peek() == arrc[q]) {
//							stack1.pop();
//							stack3.pop();
//						}
//					}
//				}
//				if(stack1.isEmpty() && stack3.isEmpty())
//				System.out.printf("#%d %d%n", t + 1, 1);
//			}
//		else
//			{System.out.printf("#%d %d%n", t + 1, 0);}
//			}
//
//			
//			
//			
//			
//			
//		}
//
//	}
//}

//System.out.printf("#%d %d%n", t + 1, 0);
//System.out.printf("#%d %d%n", t + 1, 0);

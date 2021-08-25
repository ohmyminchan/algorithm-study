package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_10828 {

   public static void main(String[] args) throws NumberFormatException, IOException {
      // TODO Auto-generated method stub
      Stack<Integer> stack = new Stack<Integer>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
      int cnt = Integer.parseInt(br.readLine());
  
      for(int i=0; i<cnt; i++) {
    	  String input = br.readLine();
    	  String[] inputt = input.split(" ");
    	  if(inputt[0].contains("push")) {
    		
    		stack.push(Integer.parseInt(inputt[1]));
    	  }else if(inputt[0].equals("pop")){
    		 System.out.println(stack.isEmpty()?-1:stack.pop());
    	  }else if(inputt[0].equals("size")) {
    		  System.out.println(stack.size());
    	  }else if(inputt[0].equals("empty")) {
    		 System.out.println(stack.isEmpty()?1:0);
    	  }else if(inputt[0].equals("top")) {
    		System.out.println(stack.isEmpty()?-1:stack.peek());
    	  }
      }
   }
}
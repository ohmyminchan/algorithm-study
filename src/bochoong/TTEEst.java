package bochoong;

public class TTEEst { 
	  int x = 3; 
	  static int y = 2; 
	  public static void main(String[] args) { 
	    int x = 10; 
	    int y = 10; 
	    TTEEst obj = new TTEEst(); 
	    obj.printIt(); 
	    obj.printIt(y); 
	 } 
	  TTEEst() { x = x+1; } 
	 static { y += y; } 
	 void printIt() { 
	   System.out.println(++x); 
	} 
	void printIt(int y) { 
	  System.out.println(" " + ++y); 
	} 
	} 
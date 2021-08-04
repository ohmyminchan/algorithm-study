package algo_live2;

public class R02_combinationTest {

	private static void hanoi(int n, int start,int temp, int dest) {
		if(n==0) return;
		
		hanoi(n-1,start,dest,temp);
		System.out.println(n+":"+start+">"+dest);
		hanoi(n-1,temp,start,dest);
		
	}
	
	
	public static void main(String[] args) {
		hanoi(3,1,2,3);
	}

}

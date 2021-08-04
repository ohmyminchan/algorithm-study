package algo_live3;

public class L01_RecursionTest {

//	public static void beepLoop(int k,int n, int[] arr) {
//		if(k == n) {return;}
//		arr[0] = k;
//		System.out.println("Before : "+k+" : "+arr[0]);
//		beepLoop(k+1,n,arr);
//		arr[0] = k;
//		System.out.println("After : "+k+" : "+arr[0]);
//	}
	
	static int Multi(int n,int m) {
		
		if(n==m)return m;
		
		
		return m * Multi(n,m-1);
	}
	
	
	public static void main(String[] args) {
//		int[] ar = new int[1];
//		beepLoop(0,3,ar);
		System.out.println(Multi(2,5));
	}

}

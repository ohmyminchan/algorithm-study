package algo_live1;

public class R01 {

	static int arr[] = {10,20,30};
	private static int printt(int a) {
		if(a ==3) {return 0;}
		System.out.println(arr[a]);
		a++;
		return printt(a);
	}
	
	public static void main(String[] args) {
		printt(0);
	}
	
	
}

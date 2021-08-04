package algo_live1;

public class R01_facto {
	
	private static int banbok(int a) {
		int sum=1;
		for(int i=1;i<a;i++) {
			sum += sum*i;
		}
		return sum;
	}
	
	private static int factorial(int a) {
		
		if(a<=1) return 1;
		
		return a * factorial(a-1);
	}

	public static void main(String[] args) {
		
		int x=10;
		System.out.println(factorial(x));
		System.out.println(banbok(x));
	}

}

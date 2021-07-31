package day2;

public class func_2 {

	public static void main(String[] args) {
		int[] arr = new int[10001];
		for(int i=1;i<10001;i++) {
			int ans = 0;
			ans = i+(i%10)+((i/10)%10)+((i/100)%10)+((i/1000)%10)+((i/10000)%10);
			for(int k=1;k<10001;k++) {
			if(ans == k) {
				arr[k]++;
			}
			}
		}
		for(int k=1;k<10001;k++) {
			if(arr[k]==0)
			System.out.println(k);
		}

	}

}

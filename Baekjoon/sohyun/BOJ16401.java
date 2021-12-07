import java.util.Arrays;
import java.util.Scanner;

public class BOJ16401 {

	static int M, N, result;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		arr = new int[N];
		
		for(int i=0; i<N; i++) arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		bs(1, arr[N-1]);
		
		System.out.println(result);
		
	}
	
	public static void bs(int s, int e) {
		if(s > e) return;
		int mid = (s+e)/2;
		int cnt = 0;
		
		for(int i=0; i<N; i++) cnt += arr[i]/mid;
		if(cnt >= M) {
			if(result < mid) result = mid;
			bs(mid+1, e);
		} else {
			bs(s, mid-1);
		}
	}
}

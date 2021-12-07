import java.util.*;

public class BOJ2110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int C = scan.nextInt();
		int[] arr = new int[N];
		for (int i=0;i<N;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		int left = 1;
		int right = arr[N-1]-arr[0];
		int d = 0;
		int ans = 0;
		while (left <= right) {
			int mid = (left+right)/2;
			int start = arr[0];
			int count = 1;
			for (int i=0;i<N;i++) {
				d=arr[i]-start;
				if (d >= mid) {
					count ++;
					start = arr[i];
				}
			}
			if(count>=C){
				ans = mid;
				left = mid + 1;
			}else{
				right = mid-1;
			}
		}
		System.out.println(ans);
	}

}

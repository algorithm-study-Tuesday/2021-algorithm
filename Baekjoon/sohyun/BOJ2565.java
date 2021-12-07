import java.util.Scanner;

public class BOJ2565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int max =0;
		int map[] = new int[501];
		int dp[] = new int[501];
		int array[] = new int[N];
		for (int i=1;i<=N;i++) {
			map[scan.nextInt()] = scan.nextInt();
		}
		int tmp = 0;
		for (int i=1;i<501;i++) {
			if (map[i]!=0) {
				array[tmp] = map[i];
				tmp++;
			}
		}
		dp[0] = 1;
		
		for(int i = 1; i < N; i++) {
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(array[i] >= array[j] && dp[j] + 1 > dp[i]) dp[i] = dp[j] + 1;
			}
			max = Math.max(max,dp[i]);
		}
		System.out.println(N-max);
	}

}

import java.util.Scanner;

public class BOJ9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i=0;i<T;i++) {
			int N = scan.nextInt();
			int[] dp = new int[11];
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;

			for (int j=4;j<=N;j++) {
				dp[j] = dp[j-1]+dp[j-2]+dp[j-3];
			}
			System.out.println(dp[N]);
		}
	}

}

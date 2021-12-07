import java.util.Scanner;

public class BOJ14501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int T[] = new int[N+1];
		int P[] = new int[N+1];
		int dp[] = new int[N+1];
		for (int i=1;i<=N;i++) {
			T[i] = scan.nextInt();
			P[i] = scan.nextInt();
			dp[i] = P[i];
		}
		for (int i=2;i<=N;i++) {
			for (int j=1;j<i;j++) {
				 if (i - j >= T[j]) dp[i] = Math.max(P[i]+dp[j], dp[i]);
			}
		}
		int max =0;
		for (int i=1;i<=N;i++) {
			if (i+T[i]<=N+1&&max < dp[i]) max = dp[i];
		}
		System.out.println(max);
	}

}

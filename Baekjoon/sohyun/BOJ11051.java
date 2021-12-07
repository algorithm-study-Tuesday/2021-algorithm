import java.util.Scanner;

public class BOJ11051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		long Nfac = 1;
		long K_fac = 1;
		long DP[][] = new long[N+1][N+1];
		for (int i=0;i<=N;i++) {
			DP[0][i] = 1;
		}
		for (int i=0;i<=N;i++) {
			DP[i][0] = 1;
		}
		for (int i=1;i<=N;i++) {
			for (int j=1;j<=N;j++) {
				DP[i][j] = (DP[i][j-1]+DP[i-1][j])%10007;
			}
		}
		/*
		for (int i=0;i<=N;i++) {
			for (int j=0;j<=N;j++) {
				System.out.print(DP[i][j]+" ");
			}
			System.out.println();
		}
		*/
		System.out.println(DP[N-K][K]);
	}

}

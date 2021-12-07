import java.util.Scanner;

public class BOJ16194 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] card = new int[N+1];
		int[] dp = new int[1001];
		for (int i=1;i<=N;i++) {
			card[i] = scan.nextInt();
		}
		dp[0] = 0;
		dp[1] = card[1];
		dp[2] = Math.min(dp[1]*2,card[2]);
		
		for(int i = 1; i <= N; i++){
            dp[i] = card[i]; 
            for(int j = 1; j <= i; j++){
                dp[i] = Math.min(dp[i], dp[i-j]+card[j]);
            }
        }
		System.out.println(dp[N]);
	}

}

import java.util.Scanner;

public class BOJ2133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] dp = new int[31];
		if (N%2==1) {
			System.out.println(0);
			return ;
		}
		dp[2] = 3;
		for(int i=4;i<=N;i=i+2) {
			dp[i]=dp[i-2]*dp[2];
			 for (int j=4;j<=i;j=j+2){
				 dp[i]+=dp[i-j]*2;
			 }
			 dp[i] = dp[i] + 2;
		}
		System.out.println(dp[N]);
	}

}

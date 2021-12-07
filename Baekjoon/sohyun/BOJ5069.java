import java.util.Scanner;

public class BOJ5069 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
        int T = scan.nextInt();
        int dp[][][] = new int[30][30][30];
        dp[1][10][11] = 1;
        dp[1][10][9] = 1;
        dp[1][11][11] = 1;
        dp[1][11][10] = 1;
        dp[1][9][9] = 1;
        dp[1][9][10] = 1;
        dp[0][10][10] = 1;
        for (int t=0;t<T;t++) {
            int n = scan.nextInt();
            if (n%2!=0) System.out.println(0);
            else {
            	for (int i=0;i<n;i++) {
            		dp[n][10][10] = dp[n-1][10][11]+dp[n-1][10][9]+dp[n-1][11][11]+dp[n-1][11][10]+dp[n-1][9][9]+dp[n-1][9][10];
            	}
            	System.out.println(dp[n][10][10]);
            }
            
        }
	}

}

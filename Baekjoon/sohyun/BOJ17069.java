import java.io.*;
import java.util.*;

public class BOJ17069 {
	static int n;
	static long[][][] dp;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		dp = new long[n][n][3];
		
		for (int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0;j<n;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp[0][1][0] = 1;
		bw.write(String.valueOf(dp()));
		bw.close();
		br.close();
	}
	static long dp() {
		// TODO Auto-generated method stub
		for (int i=0;i<n;i++) {
			for(int j=2;j<n;j++) {
				if(arr[i][j] == 1) {
					continue;
				}
				dp[i][j][0] = dp[i][j-1][0] + dp[i][j-1][2];
				if (i==0) {
					continue;
				}
				dp[i][j][1] = dp[i-1][j][1] + dp[i-1][j][2];
				if (arr[i-1][j] == 1|| arr[i][j-1] == 1) {
					continue;
				}
				dp[i][j][2] = dp[i-1][j-1][0] + dp[i-1][j-1][1] + dp[i-1][j-1][2];
			}
		}ㅗ
		return dp[n-1][n-1][0] + dp[n-1][n-1][1] + dp[n-1][n-1][2];
	}

}

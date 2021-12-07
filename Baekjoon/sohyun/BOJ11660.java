import java.io.*;
import java.util.*;

public class BOJ11660 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine().trim()); 
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());

		int map[][] = new int[N+1][N+1];
		int dp[][] = new int[N+1][N+1];
		for (int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine().trim());
			for (int j=1;j<=N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i=1;i<=N;i++) {
			
			for (int j=1;j<=N;j++) {
				dp[i][j] = map[i][j]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
			}
		}
		/*
		for (int i=1;i<=N;i++) {
			for (int j=1;j<=N;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println(" ");
		}
		*/
		for (int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine().trim()); 
			int x1 = Integer.parseInt(st.nextToken()); 
			int y1 = Integer.parseInt(st.nextToken()); 
			int x2 = Integer.parseInt(st.nextToken()); 
			int y2 = Integer.parseInt(st.nextToken());

			int ret = dp[x2][y2]-dp[x1-1][y2]-dp[x2][y1-1]+dp[x1-1][y1-1];
			System.out.println(ret);
		}
	}

}

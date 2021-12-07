/*
import java.io.*;
import java.util.Arrays;

public class BOJ1660 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp1 = new int[122];
		int[] dp2 = new int[122];
		dp1[1] = 1;
		dp2[1] = 1;
		for (int i = 2; i < 122; i++) {
			dp1[i] = dp1[i-1] + i;
			dp2[i] = dp1[i] + dp2[i-1];
		}
		int[] res = new int[N+1];
		Arrays.fill(res, Integer.MAX_VALUE);
		res[0] = 0;
		res[1] = 1;
		for (int i = 2; i <= N; i++) {
			
			for (int j = 1; j < 122; j++) {
				if(dp2[j] > i) break;
				res[i] = Math.min(res[i], res[i - dp2[j]]+1);
			}
		}
		for (int i=0;i<res.length;i++) {
			System.out.println(i+" "+res[i]);
		}
		System.out.println(res[N]);
	}

}
*/
import java.util.*;

public class BOJ1660 {

	static ArrayList<Integer> list = new ArrayList<>();
	static ArrayList<Integer> list2 = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] dp = new int[300002];
		int sum = 0;
		int index = 1;
		while (true) {
			sum = sum + index;
			if (sum >300000) break;
			list.add(sum);
			index = index + 1;
		}
		sum = 1;
		index = 1;
		list2.add(1);
		while (true) {
			sum = sum + list.get(index);
			if (sum >300000) break;
			list2.add(sum);
			index = index + 1;
		}
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for (int i=4;i<=N+1;i++) {				
			dp[i] = dp[i-1]+1;
			//System.out.println(i);
			for (int j=1;j<list2.size();j++) {
				//System.out.println(i+" "+list2.get(j));
				if (i-list2.get(j)<0) continue;
				dp[i] = Math.min(dp[i], dp[i-list2.get(j)]+1);
				//System.out.println(i+" "+dp[i]);
				if (j>=119) break;
			}
		}
		for (int i=0;i<list2.size();i++) {
			//System.out.println(i+" "+list2.get(i));
		}
		
		for (int i=0;i<dp.length;i++) {
			System.out.println(i+" "+dp[i]);
		}
		
		System.out.println(dp[N]);
		}

}


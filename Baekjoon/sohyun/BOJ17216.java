import java.util.Scanner;

public class BOJ17216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N+1];
		int[] DP = new int[N+1];
		int max = 0;
		for (int i=1;i<=N;i++) {
			A[i] = scan.nextInt();
			if (max < A[i]) max = A[i];
		}
		DP[0] = 0;
		
		for (int i=1;i<=N;i++) {
			DP[i] = A[i];
			for (int j=1;j<i;j++)  {
				if (A[j]>A[i]&&DP[i]<DP[j]+A[i]) 	
					DP[i] = DP[j]+A[i];
			}
			if(max < DP[i]) max = DP[i];
		}
		
		System.out.println(max);
	}

}

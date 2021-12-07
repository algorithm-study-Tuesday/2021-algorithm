
import java.util.Scanner;

public class BOJ17404 {
	static int N;
	static int R;
	static int G;
	static int B;
	static int min = 0;
	static int ret = 100000000;
	static int price[][];
	static int DP[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		price = new int[3][1001];
		DP = new int[3][1001];
		
		for (int i = 0; i<N;i++) {
			price[0][i]= scan.nextInt();
			price[1][i] = scan.nextInt();
			price[2][i] = scan.nextInt();
			//System.out.printf("%d	%d	%d\n",price[0][i],price[1][i],price[2][i]);
		}
		for (int j=0;j<3;j++) {
			DP[0][0] = 100000000;
			DP[1][0] = 100000000;
			DP[2][0] = 100000000;
			DP[j][0] = price[j][0];
			for (int i = 1; i<N;i++) {
				DP[2][i] = Math.min(DP[0][i-1],DP[1][i-1])+price[2][i];
				DP[1][i] = Math.min(DP[0][i-1],DP[2][i-1])+price[1][i];
				DP[0][i] = Math.min(DP[2][i-1],DP[1][i-1])+price[0][i];
				//System.out.printf("DP : %d	%d	%d\n",DP[0][i],DP[1][i],DP[2][i]);
			}
			for (int i=0;i<3;i++) {
				if (i==j) continue;
				ret = Math.min(ret,DP[i][N-1]);
				}
		}
		System.out.println(ret);
	}
	
}

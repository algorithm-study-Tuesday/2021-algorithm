import java.util.*;

public class BOJ11403 {
	static int[][] num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		boolean[][] check = new boolean[N+1][N+1];
		for (int i=1;i<=N;i++) {
			for (int j=1;j<=N;j++) {
				int tmp = scan.nextInt();
				if (tmp==1) check[i][j] = true;
			}
			
		}
		for (int k = 1; k <= N; k++)
            for (int i = 1; i <= N; i++)
                for (int j = 1; j <= N; j++)
                    if (check[i][k] &&check[k][j])
                        check[i][j] = true;

		for (int i=1;i<=N;i++) {
			for (int j=1;j<=N;j++) {
				if (!check[i][j]) System.out.print(0+" ");
				else System.out.print(1+" ");
			}
			System.out.println("");
		}
	}

}

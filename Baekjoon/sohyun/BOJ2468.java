import java.util.Scanner;

public class BOJ2468 {
	public static int[][] map;
	public static int[][] ret;
	public static int N;
	public static int count = 0;
	public static int result = 0;
	static int[] dx = {-1, 0, 1, 0}; 
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		map = new int[N+1][N+1];
		ret = new int[N+1][N+1];
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				int tmp = scan.nextInt();
				if (tmp<=N) {
					map[i][j] = 1;
					ret[i][j] = 1;
				}
			}
		}
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				if (map[i][j]==0)	dfs(i,j);
			}
		}
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				System.out.print(ret[i][j]+" ");
				if (ret[i][j] == 0) {
					result ++;
				}
			}
			System.out.println();
		}
		System.out.print(result);
	}
	public static void dfs(int x,int y) {
		count = 0;
		for (int i = 0; i<4;i++) {
			if (count>1) {
				ret[x][y] = 1;
				break;
			}
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (0<=nextX && 0<=nextY && nextX<N && nextY<N&&map[nextX][nextY]==1) {
				count ++;
			}
		}
	}
}

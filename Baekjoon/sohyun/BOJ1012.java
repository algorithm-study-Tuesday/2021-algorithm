import java.util.Scanner;

public class BOJ1012 {
	static int M,N;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0}; 
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for  (int t=0;t<T;t++) {
			M = scan.nextInt();
			N = scan.nextInt();
			map = new int[M][N];
			visited = new boolean[M][N];
			int cnt = 0;
			int K = scan.nextInt();
			for (int i=0;i<K;i++) {
				int X = scan.nextInt();
				int Y = scan.nextInt();
				map[X][Y] = 1;
			}
			for (int i=0;i<M;i++) {
				for (int j=0;j<N;j++) {
					if (map[i][j]==1&&!visited[i][j]) {
						visited[i][j]= true;
						dfs(i,j);
						cnt ++;
					}
				}
			}
			System.out.println(cnt);
		}
		
	}
	public static void dfs(int x,int y) {
		int pin = map[x][y];
		for (int i = 0; i<4;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			//System.out.printf("next %d	%d\n",nextX,nextY);
			if (0<=nextX && 0<=nextY && nextX<M && nextY<N&&!visited[nextX][nextY]&&map[nextX][nextY]==pin) {
				//System.out.printf("여기 들어\n");
				visited[nextX][nextY] = true; 
				//System.out.printf("x y %d	%d  %d \n",nextX,nextY,pin);

				//System.out.println(count);
				dfs(nextX,nextY);
			}
		}
	}

}

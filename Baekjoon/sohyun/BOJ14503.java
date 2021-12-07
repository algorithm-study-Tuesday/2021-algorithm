import java.util.Scanner;

public class BOJ14503 {
	public static int N, M;
    public static int[][] map;
    public static int cnt = 0;
    public static int[] dr = {-1, 0, 1, 0}; // 북,동,남,서
    public static int[] dc = {0, 1, 0, -1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		int r = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		map = new int[N][M];
		for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				map[i][j] = scan.nextInt();
			}
		}
		clean(r,c,d);
		System.out.println(cnt);
	}
	public static void clean(int row, int col, int dir) {
		if(map[row][col] == 0) {
			map[row][col] = 2;
			cnt ++;
		}
		boolean flag = false;
		int origin = dir;
		for (int i=0;i<4;i++) {
			int nextd = (dir+3)%4;
			int nextr = row + dr[nextd];
			int nextc = col + dc[nextd];
			if (nextr > 0 && nextc > 0 && nextr < N && nextc < M) {
				if (map[nextr][nextc] == 0) {
					clean(nextr, nextc, nextd);
					flag = true;
					break;
				}
			}
			dir = (dir + 3) % 4;
		}
		if (!flag) {
			int nextd = (origin + 2) % 4;
			int nextbr = row + dr[nextd];
			int nextbc = col + dc[nextd];
			if (nextbr > 0 && nextbc > 0 && nextbr < N && nextbc < M) {
				if (map[nextbr][nextbc]!= 1) {
					clean(nextbr,nextbc,origin);
				}
			}
		}
	}
}

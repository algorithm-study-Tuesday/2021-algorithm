import java.util.*;

public class BOJ14502 {
	public static int blank = 0;
	public static int wall = 1;
	public static int virus = 2;
	public static int[] dx = {0,0,1,-1};
	public static int[] dy = {1,-1,0,0};
	public static int n,m;
	public static int[][] inputArr;
	public static int[][] map;
	public static int ans = Integer.MIN_VALUE;
	
	static class Pair {
		int x;
		int y;
		Pair (int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		map = new int[n][m];
		inputArr = new int[n][m];
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				inputArr[i][j] =map[i][j] = scan.nextInt();
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if(inputArr[i][j] == blank) {
					map[i][j] = wall;
					dfs(1);
					map[i][j] = blank;
				}
			}
		}
		System.out.println(ans);
	}
	public static void dfs(int count) {
		if (count == 3) {
			bfs();
			return ;
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if (map[i][j] == blank) {
					map[i][j] = wall;
					dfs(count+1);
					map[i][j] = blank;
				}
			}
		}
	}
	public static void bfs() {
		int[][] virusMap = new int[n][m];
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				virusMap[i][j] = map[i][j];
			}
		}
		Queue<Pair> q = new LinkedList<Pair>();
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if (virusMap[i][j] == virus) {
					q.add(new Pair(i,j));
				}
			}
		}
		while(!q.isEmpty()) {
			Pair p = q.remove();
			int x = p.x;
			int y = p.y;
			for (int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (virusMap[nx][ny] == blank) {
						virusMap[nx][ny] = virus;
						q.add(new Pair(nx,ny));
					}
				}
			}
		}
		calAnswer(virusMap);
	}
	public static void calAnswer(int[][] virusMap) {
		int count = 0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if (virusMap[i][j] == blank) count ++;
			}
		}
		ans = Math.max(count, ans);
	}
}


//조합으로 벽을 세워야 함
//bfs로바이러스를 퍼트리고 최대를 구하는 것
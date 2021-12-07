import java.util.Scanner;

public class BOJ1913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int pin = scan.nextInt();
		int map[][] = new int[N][N];
		int count = N*N;
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		for(int i = 0; i <= N/2; i++) {
			int x = i;
			int y = i;
			int idx = 0;
			map[i][i] = count--;
			while(idx < 4) {
				int xx = x + dx[idx], yy= y + dy[idx];
				if (xx >= N||yy >= N||xx<0||yy<0) idx++;
				else if(map[xx][yy]!=0) idx++;
				else {
					map[xx][yy] = count--;
					x = xx;
					y = yy;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		int x = 0, y = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				int val = map[i][j];
				if(map[i][j] == pin) {
					x = i;
					y = j;
				}
                sb.append(val).append(" ");
			}
			sb.append("\n");
		}
		
		sb.append(x+1).append(" ").append(y+1);
		
		System.out.println(sb.toString());
	}
}

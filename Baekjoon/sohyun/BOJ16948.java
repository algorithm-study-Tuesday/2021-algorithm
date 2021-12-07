import java.util.Scanner;

public class BOJ16948 {
	static int N;
	static int r1,c1,r2,c2;
	static int[] dx = {-2, -2, 0, 0,2,2}; 
	static int[] dy = {-1, 1, -2, +2,-1,1};
	static int min = 1000000000;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		r1 = scan.nextInt();
		c1 = scan.nextInt();
		r2 = scan.nextInt();
		c2 = scan.nextInt();
		dfs(r1,c1);
		System.out.println(min);
	}
	public static void dfs(int x, int y) {
		count ++;
		for (int i = 0; i<6;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if(nextX==r2&&nextY==c2) {
				if (min>count) min = count;
			}
			if (0<=nextX && 0<=nextY && nextX<N && nextY<N) {;
				dfs(nextX,nextY);
			}
		}
	}
}

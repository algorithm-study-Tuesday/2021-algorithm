import java.util.Scanner;

public class BOJ2606 {
	static int computer;
	static int line;
	static int start;
	static int map[][];
	static boolean visited[];
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		computer = scan.nextInt();
		line = scan.nextInt();
		start = 1;
		map = new int[computer+1][computer+1];
		visited = new boolean[computer+1];
		
		for(int i=0; i<line; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			map[a][b] = map[b][a]= 1;
		}
		
		System.out.println(dfs(1));
	}
	public static int dfs(int i) {
		visited[i] = true;
		for (int j=0;j<=computer;j++) {
			if(!visited[j]&&map[i][j]==1) {
				count ++;
				dfs(j);
			}
		}
		return count;
	}
}

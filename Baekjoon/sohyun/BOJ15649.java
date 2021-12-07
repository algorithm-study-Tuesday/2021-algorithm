import java.util.*;

public class BOJ15649 {	
	public static boolean[] visited;
	public static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		arr = new int[M];
		visited = new boolean[N];
		dfs(N,M,0);
	}
	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return ;
		}
		for (int i=0;i<N;i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				dfs(N,M,depth+1);
				visited[i] = false; 
			}
		}
	}
}

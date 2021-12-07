import java.util.*;

public class BOJ11725 {
	static int n;
	static int[] parents;
	static List<Integer>[] list;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		list = new ArrayList[n+1];
		parents = new int[n+1];
		for (int i=1;i<= n; i++) {
			list[i] = new ArrayList<>();
		}
		visited = new boolean[n+1];
		for (int i=0;i<n-1;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		dfs(1);
		for (int i=2;i<=n;i++) {
			System.out.println(parents[i]);
		}
	}
	static void dfs(int v) {
		visited[v] = true;
		for(int i : list[v]) {
			if(!visited[i]) {
				parents[i] = v;
				dfs(i);
			}
		}
	}

}

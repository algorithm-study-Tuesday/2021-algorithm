import java.util.*;

public class BOJ2668 {
	static ArrayList<Integer> list;
	static boolean[] visited;
	static int[] num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		num = new int[N+1];
		list = new ArrayList<>();
		visited = new boolean[N + 1];
		for (int i=1;i<=N;i++) {
			num[i] = scan.nextInt();
		}
		for(int i = 1; i <= N; i++) {
			visited[i] = true;
			dfs(i, i);
			visited[i] = false;
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public static void dfs(int i, int target) {
		if (visited[num[i]] == false) {
			visited[num[i]] = true;
			dfs(num[i],target);
			visited[num[i]] = false;
		}
		if(num[i] == target) list.add(target);
	}
}

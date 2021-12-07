import java.util.*;
import java.util.Scanner;

public class BOJ15654 {	
	public static boolean[] visited;
	public static int[] arr;
	public static int[] num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		num = new int[N];
		arr = new int[M];
		for (int i=0;i<N;i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
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
				arr[depth] = num[i];
				dfs(N,M,depth+1);
				visited[i] = false; 
			}
		}
	}
}

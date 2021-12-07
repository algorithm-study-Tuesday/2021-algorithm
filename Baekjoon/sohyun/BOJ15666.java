import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class BOJ15666 {	
	public static int[] num;
	public static int[] arr;
	public static int N,M;
	public static boolean[] visited;
	public static LinkedHashSet<String> answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		num = new int[N];
		arr = new int[M];
		visited = new boolean[N];
		answer = new LinkedHashSet<>();
		for (int i=0;i<N;i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		dfs(0,0);
		answer.forEach(System.out::println);
	}
	public static void dfs(int pin, int depth) {
		if (depth == M) {
			StringBuilder sb = new StringBuilder();
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			answer.add(sb.toString());
			return ;
		}
		for (int i=pin;i<N;i++) {
			arr[depth] = num[i];
			dfs(i,depth+1);
		}
	}
}

import java.util.Scanner;

public class BOJ15652 {	
	public static int[] arr;
	public static int N,M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		arr = new int[M];
		dfs(1,0);
	}
	public static void dfs(int pin, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return ;
		}
		for (int i=pin;i<=N;i++) {
			arr[depth] = i;
			dfs(i,depth+1);
		}
	}
}

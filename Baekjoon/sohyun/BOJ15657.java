import java.util.Arrays;
import java.util.Scanner;

public class BOJ15657 {	
	public static int[] num;
	public static int[] arr;
	public static int N,M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		num = new int[N];
		arr = new int[M];
		for (int i=0;i<N;i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		dfs(0,0);
	}
	public static void dfs(int pin, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return ;
		}
		for (int i=pin;i<N;i++) {
			arr[depth] = num[i];
			dfs(i,depth+1);
		}
	}
}

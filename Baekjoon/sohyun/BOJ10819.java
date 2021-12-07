import java.util.*;

public class BOJ10819 {
	static int N;
	static int[] arr;
	static int[] ArrayCase;
	static boolean[] visited;
	static int ret;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		arr = new int[N];
		for (int i=0;i<N;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		visited = new boolean[N];
		ArrayCase = new int[N];
		ret = 0;
		brute(0);
		System.out.print(ret);
	}
	public static void brute(int count) {
		if (count==N) {
			int sum=0;
			for (int i=0;i<N-1;i++) {
				sum = sum+Math.abs(ArrayCase[i]-ArrayCase[i+1]);
			}
			ret = Math.max(ret,sum);
			return ;
		}
		for (int i=0;i<N;i++) {
			if (visited[i]) continue;
			visited[i] = true;
			ArrayCase[count]=arr[i];
			brute(count+1);
			visited[i] = false;
		}
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X[] = new int[N];
		for (int i=0;i<N;i++) {
			X[i] = scan.nextInt();
		}
		Arrays.sort(X);
		int max = X[0]*N;
		for (int i=0;i<N;i++) {
			int tmp = X[i] * (N-i);
			if (max < tmp) max = tmp;
		}
		System.out.println(max);
	}
	
}

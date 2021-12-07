import java.util.Scanner;

public class BOJ11659 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int sum_ = 0;
		int[] sum = new int[N+1];
		for (int i=1;i<=N;i++) {
			sum_ =sum_ + scan.nextInt();
			sum[i] = sum_;
		}
		for (int i=0;i<M;i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			System.out.println(sum[end]-sum[start-1]);
		}
	}

}

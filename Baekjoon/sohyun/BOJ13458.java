import java.util.Scanner;

public class BOJ13458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long ret = 0;
		int N = scan.nextInt();
		long A[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = scan.nextInt();
		}
		int B = scan.nextInt();
		int C = scan.nextInt();
		for (int i=0;i<N;i++) {
			ret ++;
			if (A[i]>B) {
				ret = ret + (A[i]-B)/C;
				if ((A[i]-B)%C>0) ret ++;
			}
		}
		System.out.println(ret);
	}

}

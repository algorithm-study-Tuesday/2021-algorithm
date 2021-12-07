import java.util.*;

public class BOJ20117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int start = 0;
		int N = scan.nextInt();
		int a[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		int ret = 0;
		if (N%2==0) start = N/2;
		else {
			start = (N+1)/2;
			ret = a[(N+1)/2-1];
		}
		int sum = 0;
		for (int i=start;i<N;i++) {
			sum = sum + a[i];
		}
		ret = ret+sum*2;
		System.out.println(ret);
	}

}

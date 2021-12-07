import java.util.*;

public class BOJ2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] num = new int[N];
		for (int i=0;i<N;i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		for (int i=0;i<N;i++) {
			System.out.println(num[i]);
		}
	}

}

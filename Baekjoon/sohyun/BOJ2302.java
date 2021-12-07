import java.util.*;

public class BOJ2302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		Long[] dp = new Long[41];
		ArrayList<Integer> list = new ArrayList<Integer>();
		dp[0] = (long) 1;
		dp[1] = (long) 1;
		dp[2] = (long) 2;
		dp[3] = (long) 3;
		for (int i=4;i<41;i++) {
			dp[i] = dp[i-2]+ dp[i-1];
		}
		int pin = 1;
		int tmp =0;
		for (int i=0; i<M;i++) {
			tmp = scan.nextInt();
			list.add(tmp-pin);
			pin = tmp + 1;
		}
		list.add(N+1-pin);
		long ret = 1;
		for (int i=0;i<list.size();i++) {
			ret = ret * dp[list.get(i)];
			//System.out.println(list.get(i));
		}

		System.out.println(ret);
	}

}

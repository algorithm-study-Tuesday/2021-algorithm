import java.util.Scanner;

public class BOJ1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		boolean[] num = new boolean[1001];
		for (int i=100;i<1000;i++) {
			int tmp2 = i/100;
			int tmp1 = i/10-tmp2*10;
			int tmp0 = i-100*tmp2-10*tmp1;
			if (tmp2-tmp1==tmp1-tmp0) num[i] =true;
 		}
		if  (N<100) System.out.print(N);
		else if (N==100) System.out.print(99);
		else if (100<N&&N<1000) {
			int ret = 99;
			for (int i=100;i<=N;i++) {
				if (num[i]==true) ret++;
	 		}
			System.out.print(ret);
		}
		else {
			int ret = 99;
			for (int i=100;i<=999;i++) {
				if (num[i]==true) ret++;
	 		}
			System.out.print(ret);
		}
	}

}

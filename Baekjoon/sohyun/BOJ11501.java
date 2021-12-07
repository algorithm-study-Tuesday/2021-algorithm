import java.util.*;

public class BOJ11501 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int t=0;t<T;t++) {
			int N = scan.nextInt();
			long day[] = new long[N];
			for (int i=0;i<N;i++) {
				day[i] = scan.nextInt();
			}
			long max = day[N-1];
			//System.out.println("max"+max);
			long ret = 0;
			for (int i=N-2;i>=0;i--) {
				if (day[i]<max) {
					ret = ret + max - day[i];
				}
				else {
					max = day[i];
				}	
			}
			System.out.println(ret);
		}
	}
}

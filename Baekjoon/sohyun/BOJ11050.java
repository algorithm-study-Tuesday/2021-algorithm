import java.util.Scanner;

public class BOJ11050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		long Nfac = 1;
		long K_fac = 1;
		
		if (K==0) {System.out.print(1); return ;}
		for(int i=K+1;i<=N;i++) {
			Nfac = (Nfac * i);
		}
		
		for(int i=1;i<N-K+1;i++) {
			K_fac = (K_fac * i);
		}
		System.out.print((Nfac/K_fac)%10007);
	}

}

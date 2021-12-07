import java.util.Scanner;

public class BOJ16922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		boolean[] map = new boolean[N*50+1];
		int ret = 0;
		for(int i=0;i<=20;i++) {
			for(int j=0;j<=20;j++) {
				for(int k=0;k<=20;k++) {
					for(int l=0;l<=20;l++) {
						if(i+j+k+l==N) {
							map[i*1+j*5+k*10+l*50] = true;
						}
					}
				}
			}
		}
		for(int i=0;i<=N*50;i++) {
			if (map[i]) ret++;
		}
		System.out.println(ret);
	}

}

import java.util.Scanner;

public class BOJ1051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		char map[][] = new char[N][M];
		scan.nextLine();
		for (int i=0;i<N;i++) {
			String  str = scan.nextLine();
			char[] tmp = str.toCharArray();
			for (int j=0;j<M;j++) {
				map[i][j] = tmp[j];
			}
		}
		int ans = 0;
		char check = ' ';
		int k=Math.max(N,M);
		
		while(true) {
			for (int i=0;i<N-k;i++) {
				for (int j=0;j<M-k;j++) {
					if (map[i][j]==map[i+k][j]&&map[i+k][j]==map[i][j+k]&&map[i][j+k]==map[i+k][j+k]){
						System.out.println((k+1)*(k+1));
						return ;
					}
				}
			}
			k--;
	}

	}

}

import java.util.Scanner;

public class BOJ1080 {
	static int N,M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		int[][] a = new int[N][M]; 
		int[][] b = new int[N][M]; 
		
		for (int i = 0; i < N; i++) { 
			String temp = scan.next(); 
			for (int j = 0; j < M; j++) {
				a[i][j] = temp.charAt(j) - '0'; 
			} 
		} 
		for (int i = 0; i < N; i++) { 
			String temp = scan.next(); 
			for (int j = 0; j < M; j++) { 
				b[i][j] = temp.charAt(j) - '0'; 
			} 
		}
		
		int count = 0; 
		for (int i = 0; i <= N - 3; i++) { 
			for (int j = 0; j <= M - 3; j++) { 
				if (a[i][j] != b[i][j]) { 
					count++; 
					for (int p = i; p < i + 3; p++) { 
						for (int q = j; q < j + 3; q++) { 
							a[p][q] = (a[p][q] == 0) ? 1 : 0; } 
					} 
				} 
			} 
		}

		boolean check = true; 
		for (int i = 0; i < N; i++) { 
			for (int j = 0; j < M; j++) { 
				if (a[i][j] != b[i][j]) { 
					check = false; break; 
				} 
			}
		}
		//if(check) System.out.println("-1");
		//else System.out.println(count);
		System.out.println((check) ? count : -1);

	}

}
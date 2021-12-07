import java.util.*;

public class BOJ9252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] str1 =scan.nextLine().toCharArray();
		char[] str2 =scan.nextLine().toCharArray();
		int N = str1.length;
		int M = str2.length;
		int[][] DP = new int[N+1][M+1];
		Stack<Character> stack = new Stack<>();
		/*
		for(int i=0;i<str1.length;i++) {
			System.out.printf(str1[i]+" ");
		}
		for(int i=0;i<str2.length;i++) {
			System.out.printf(str2[i]+" ");
		}
		*/
		
		for(int i=0;i<=N;i++) {
			for (int j=0;j<=M;j++) {
				if(i==0||j==0) {
					DP[i][j]=0;
					continue;
				}
				if (str1[i-1]==str2[j-1]) {
					DP[i][j] = DP[i-1][j-1]+1;
				}
				else {
					DP[i][j] = Math.max(DP[i-1][j], DP[i][j-1]);
				}
			}
		}
		
		System.out.println(DP[N][M]);
/*
		for(int i=0;i<=N;i++) {
			for (int j=0;j<=M;j++) {
				System.out.print(DP[i][j]+" ");
			}
			System.out.println();
		}
*/		
		while (DP[N][M] != 0) {
			if (DP[N][M] == DP[N][M-1]) M--;
			else if (DP[N][M] == DP[N-1][M]) N--;
			else if (DP[N][M]-1==DP[N-1][M-1]) {
				stack.push(str1[N-1]);
				N--;
				M--;
			}
		}

		
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
	}

}

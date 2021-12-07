import java.util.ArrayList;
import java.util.Scanner;

public class BOJ12886 {
	static int A,B,C;
	static int sum;
	static int res = 0;
	static boolean[][] visited = new boolean[1501][1501];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        sum = A+B+C;
        if(sum%3!=0) {
        	System.out.println(res);
        	return;
        }
        else {
        	dfs(A,B,C);
        	System.out.println(res);
        	return;
        }
	}
	public static void dfs(int A,int B, int C) {
		if(A==B&&A==C) {
			res = 1;
        	return;
		}
		sol(A,B);
		sol(B,C);
		sol(A,C);
	}
	public static void sol(int x,int y) { 
		int small = Math.min(x,y);
        int big = Math.max(x,y);
        
        if(!visited[small*2][big-small]||!visited[big-small][small*2]) {
        	visited[small*2][big-small] = true;
        	visited[big-small][small*2] = true;
        	visited[small*2][sum-big-small] = true;
        	visited[sum-big-small][small*2] = true;
        	visited[sum-big-small][big-small] = true;
        	visited[big-small][sum-big-small] = true;
        	
        	dfs(small*2,big-small,sum-big-small);
        }
	}
}

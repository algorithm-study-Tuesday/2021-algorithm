import java.util.*;

public class BOJ1780 {
	public static int[][] map;
	public static int minus = 0;
	public static int zero = 0;
	public static int plus = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		map = new int[N][N];
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				map[i][j] = scan.nextInt();
			}
		}
		partion(0,0,N);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(plus);
		
	}
	public static void partion(int row,int col,int size) {
		if (check(row,col,size)) {
			if(map[row][col]==-1) {
				minus++;
			}
			else if(map[row][col]==0) {
				zero++;
			}
			else if(map[row][col]==1) {
				plus++;
			}
			return; 
		}
		int newSize = size/3;
		partion(row,col,newSize);
		partion(row,col+newSize,newSize);
		partion(row,col+2*newSize,newSize);
		partion(row+newSize,col,newSize);
		partion(row+newSize,col+newSize,newSize);
		partion(row+newSize,col+2*newSize,newSize);
		partion(row+2*newSize,col,newSize);
		partion(row+2*newSize,col+newSize,newSize);
		partion(row+2*newSize,col+2*newSize,newSize);
	}
	
	
	public static boolean check(int row,int col,int size) {
		int color = map[row][col];
		for (int i=row;i<row+size;i++) {
			for (int j=col;j<col+size;j++) {
				if(color!=map[i][j]) return false;
			}
		}
		return true;
	}
}


import java.util.Scanner;

public class BOJ1992 {
	
	public static int[][] map;		// 흑백 이미지
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		map = new int[N][N];	
		for(int i = 0; i < N; i++) {
			String str = scan.next();
			for(int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		QuadTree(0, 0, N);
		System.out.println(sb);
	}
	
	public static void QuadTree(int x, int y, int size) {
		if(isPossible(x, y, size)) {
			sb.append(map[x][y]);
			return;
		}
		int newSize = size/2;	
		
		sb.append('(');	
		
		QuadTree(x, y, newSize);					
		QuadTree(x, y + newSize, newSize);			
		QuadTree(x + newSize, y, newSize);			
		QuadTree(x + newSize, y + newSize, newSize);
		sb.append(')');	
	}
	
	public static boolean isPossible(int x, int y, int size) {
		int value = map[x][y];
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(value != map[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
 
}
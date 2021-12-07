import java.util.ArrayList;
import java.util.Scanner;

public class BOJ14889 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList <Integer>();
		int N = scan.nextInt();
		int map[][] = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				map[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				arr.add(map[i][j]+map[j][i]);
			}
		}
		for (int i=0;i<arr.size()-1;i++) {
			System.out.println(arr.get(i));
			}
	}

}

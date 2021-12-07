import java.util.*;

public class BOJ1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] time = new int[N][2];
		for(int i = 0; i < N; i++) {
			time[i][0] = scan.nextInt();
			time[i][1] = scan.nextInt();
		}
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] start, int[] end) {
				if(start[1] == end[1]){
					return Integer.compare(start[0], end[0]);
					}
				return Integer.compare(start[1], end[1]);
			}
		});
		int count = 0;
		int end = -1;
		for (int i=0;i<N;i++) {
			if (time[i][0] >= end) {
				end = time[i][1];
				count ++;
			}
		}
		System.out.println(count);
	}

}

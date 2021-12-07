import java.util.*;

public class BOJ4307 {
	static int[] array;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int t =0;t<test;t++) {
			int l = scan.nextInt();
			int n = scan.nextInt();
			int min = 0;
			int max = 0;
			array = new int[n];
			for (int i=0;i<n;i++) {
				array[i] = scan.nextInt();
			}
			Arrays.sort(array);
			for (int i=0;i<n;i++) {
				 int tmp = Math.min(array[i], l-array[i]);
				 min = Math.max(min, tmp);
			}
			max = l - Math.min(array[0],l-array[n-1]);
			System.out.printf("%d %d\n",min,max);
		}
	}

}

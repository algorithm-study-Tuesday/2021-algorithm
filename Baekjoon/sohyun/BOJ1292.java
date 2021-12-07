import java.util.Scanner;

public class BOJ1292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int[] array = new int[1002];
		int count = 1;
		for (int i=0;i<=1000;i++) {
			for(int j=0;j<i;j++) {
				if(count == 1001) break;
				array[count] = i;
				count ++;
			}
		}
		int sum = 0;
		for (int i=A;i<=B;i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
	}

}

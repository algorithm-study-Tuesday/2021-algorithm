import java.util.Scanner;

public class BOJ1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int min = 51;
		String str = scan.nextLine();
		String[] compare_str = str.split(" ");
		char[] A = compare_str[0].toCharArray();
		char[] B = compare_str[1].toCharArray();
		
		for(int i=0;i<=B.length-A.length;i++) {
			int tmp = 0;
			for(int j=0;j<A.length;j++) {
				if (A[j]!=B[j+i]) tmp++;
			}
			if(tmp<min) min = tmp;
		}
		System.out.print(min);
	}

}

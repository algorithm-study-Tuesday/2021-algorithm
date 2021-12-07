import java.util.Scanner;

public class BOJ10179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++) {
			double price = scan.nextDouble();
			System.out.println("$"+String.format("%.2f",(price*80)/100.0 ));
		}
	}

}

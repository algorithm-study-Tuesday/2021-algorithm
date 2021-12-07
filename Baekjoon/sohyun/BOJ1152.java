import java.util.Scanner;

public class BOJ1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		if(str.equals(" ")) {
			System.out.println(0);
			return ;
		}
		String[] arr = str.split(" ");
		int count = arr.length;
		if (arr[0].equals("")) count --;
		if (arr[arr.length-1].equals("")) count --;
		System.out.println(count);
	}

}

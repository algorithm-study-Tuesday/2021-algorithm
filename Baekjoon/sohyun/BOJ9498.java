import java.util.Scanner;

public class BOJ9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		if (grade>=90) System.out.println("A");
		else if (90>grade&&grade>=80) System.out.println("B");
		else if (80>grade&&grade>=70) System.out.println("C");
		else if (70>grade&&grade>=60) System.out.println("D");
		else System.out.println("F");
	}

}

import java.util.*;
public class BOJ17413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Stack<Character> stack = new Stack<Character>();
		char[] array = str.toCharArray();
		boolean check = false;
		String tmp = "";
		for (int i=0;i<array.length;i++) {
			if (array[i]=='<') {
				while (!stack.empty()) {
					System.out.print(stack.pop());
				}
				tmp = tmp + array[i];
				check = true;
			}
			else if (array[i]=='>') {
				tmp = tmp + array[i];
				System.out.print(tmp);
				check = false;
				tmp = "";
			}
			else if (array[i] ==' ') {
				if (!check) {
					while (!stack.empty()) {
						System.out.print(stack.pop());
					}
					System.out.print(" ");
				}
				else {
					tmp = tmp + array[i];
				}
			}
			else {
				if (!check) {
					stack.push(array[i]);
				}
				else {
					tmp = tmp + array[i];
				}
				
			}
		}
		while (!stack.empty()) {
			System.out.print(stack.pop());
		}
	}

}

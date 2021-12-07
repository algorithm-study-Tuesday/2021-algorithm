import java.util.*;

public class BOJ10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int N = scan.nextInt();
		int ret = 0;
		for (int i=0;i<N;i++) {
			int tmp = scan.nextInt();
			if (tmp!=0) stack.push(tmp);
			else stack.pop();

		}
		while(!stack.empty()) {
			ret = ret + stack.pop();
		}
		System.out.print(ret);
	}

}

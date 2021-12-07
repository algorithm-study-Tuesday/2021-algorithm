import java.util.*;

public class BOJ2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String arr[] = S.split("");
		int ret = 0;
		Stack<String> stack = new Stack<String>();
		if (arr.length%2==1) {
			System.out.println(ret); return ;
		}
		int tmp = 1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals("(")) {
				tmp *= 2;
				stack.push(arr[i]);
			} else if(arr[i].equals("[")) { 
				tmp *= 3;
				stack.push(arr[i]);
			} else if(arr[i].equals(")")) {
				if(stack.isEmpty() || !stack.peek().equals("(")){
					System.out.println(0); return ;
				}
				if(arr[i-1].equals("("))
					ret += tmp;
				stack.pop();
				tmp /= 2;
			} else if(arr[i].equals("]")) {
				if(stack.isEmpty() || !stack.peek().equals("[")){
					System.out.println(0); return ;
				}
				if(arr[i-1].equals("["))
					ret += tmp;
				stack.pop();
				tmp /= 3;
			}
		}
		System.out.println(ret);
	}

}
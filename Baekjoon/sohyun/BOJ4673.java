import java.util.Scanner;

public class BOJ4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] res = new boolean[10001];
		for (int i=1;i<10001;i++) {
			int tmp = i;
			String change = Integer.toString(i);
			char[] myChars =change.toCharArray();
			for (int j=0;j<myChars.length;j++) {
				int digit = myChars[j] - '0';
				tmp = tmp + digit;
				
			}
			if (tmp < 10001)	res[tmp] = true;
		}
		for (int i=1;i<10001;i++) {
			if(!res[i]) System.out.println(i);
		}
	}

}
 
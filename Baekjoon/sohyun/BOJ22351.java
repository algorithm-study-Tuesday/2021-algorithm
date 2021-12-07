import java.util.*;

public class BOJ22351 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String inputstr= scan.nextLine();
		char[] inputchar = inputstr.toCharArray();
		String str = "";
		for (int i=1;i<1000;i++) {
			str = str + String.valueOf(i);
		}
		char[] array = str.toCharArray();
		
		for  (int i=0;i<array.length-inputchar.length+1;i++) {
			for (int j=0;j<inputchar.length;j++) {
				if(inputchar[j]!=array[i+j])
			}
		}
	}

}

import java.util.*;

public class BOJ2240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int T = scan.nextInt();
		int W = scan.nextInt();
		int pin = scan.nextInt();
		int count = 1;
		for (int i=1;i<T;i++) {
			int tmp = scan.nextInt();
			if (tmp == pin&&pin==1) 
				count ++;
			
			else if (tmp == pin&&pin==2) 
				count ++;
			
			else if (tmp != pin&&pin==1) {
				list1.add(count);
				count = 1;
			}
			else if (tmp != pin&&pin==2) {
				list2.add(count);
				count = 1;
			}
			pin = tmp;
		}
		if (pin == 1) list1.add(count);
		else list2.add(count);
		
		
		/*
		for (int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		for (int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		*/
	}

}

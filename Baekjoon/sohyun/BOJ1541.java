import java.util.*;

public class BOJ1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] array = str.split("-");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			String[] tmp = array[i].split("\\+");
			int num = 0;
			for (int j=0;j<tmp.length;j++) {
				num = num + Integer.parseInt(tmp[j]);
			}
			list.add(num);
			//System.out.println(array[i]);
		}
		int ret = list.get(0);
		for (int i=1;i<list.size();i++) {
			ret = ret - list.get(i);
		}
		System.out.println(ret);
	}

}

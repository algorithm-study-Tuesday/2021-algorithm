import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int tmp = 0;
        double sum = 0;
        int[] array = new int[N];
        int[] count = new int[N];
        for (int i=0;i<N;i++) {
        	tmp = scan.nextInt();
        	array[i] = tmp;
        	sum = sum + tmp;
        }
       
        Arrays.sort(array);
        count[0] = 1;
        for (int i=1;i<N;i++) {
        	if (array[i-1]==array[i]) {
        		count[i]=count[i-1]+1;
        	}
        	else {
        		count[i] = 1;
        	}
        }
        
        int max = 0;
        
        
        for (int i=0;i<N;i++) {
        	if (count[i]>max) {
        		max = count[i];
        	}
        }
        for (int i=0;i<N;i++) {
       //	 System.out.println(count[i]);
       }
        //System.out.println();
        for (int i=0;i<N;i++) {
        	if (count[i]==max) {
        		list.add(array[i]);
        	}
        }
        for (int i=0;i<list.size();i++) {
        	 //System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(Math.round(sum/N));
        System.out.println(array[(N-1)/2]);
        
        if (list.size()!=1){
        	System.out.println(list.get(1));
        }
        else System.out.println(list.get(0));
        
        
        System.out.println(array[N-1]-array[0]);
	}

}

import java.util.Scanner;

public class BOJ14600 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
        int K = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        if (K==1) {
        	if (x==1&&y==1) {
        		System.out.println("1 1");
        		System.out.println("-1 1");
        	}
        	else if (x==1&&y==2) {
        		System.out.println("-1 1");
        		System.out.println("1 1");
        	}
        	else if (x==2&&y==1) {
        		System.out.println("1 1");
        		System.out.println("1 -1");
        	}
        	else if (x==2&&y==2) {
        		System.out.println("1 -1");
        		System.out.println("1 1");
        	}
        }
        if (K==2) {
        	if (x==1&&y==1) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 3 5");
        		System.out.println("1 1 3 2");
        		System.out.println("-1 1 2 2");
        	}
        	else if (x==1&&y==2) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 3 5");
        		System.out.println("-1 1 3 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==1&&y==3) {
        		System.out.println("4 4 5 5");
        		System.out.println("-1 4 3 5");
        		System.out.println("1 3 3 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==1&&y==4) {
        		System.out.println("-1 4 5 5");
        		System.out.println("4 4 3 5");
        		System.out.println("1 3 3 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==2&&y==1) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 3 5");
        		System.out.println("1 1 3 2");
        		System.out.println("1 -1 2 2");
        	}
        	else if (x==2&&y==2) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 3 5");
        		System.out.println("1 -1 3 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==2&&y==3) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 -1 3 5");
        		System.out.println("1 3 3 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==2&&y==4) {
        		System.out.println("4 -1 5 5");
        		System.out.println("4 4 3 5");
        		System.out.println("1 3 3 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==3&&y==1) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 3 5");
        		System.out.println("1 3 2 2");
        		System.out.println("1 1 -1 2");
        	}
        	else if (x==3&&y==2) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 3 5");
        		System.out.println("1 3 -1 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==3&&y==3) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 -1 5");
        		System.out.println("1 3 3 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==3&&y==4) {
        		System.out.println("4 4 -1 5");
        		System.out.println("4 3 5 5");
        		System.out.println("1 3 3 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==4&&y==1) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 3 5");
        		System.out.println("1 3 2 2");
        		System.out.println("1 1 2 -1");
        	}
        	else if (x==4&&y==2) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 3 5");
        		System.out.println("1 3 2 -1");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==4&&y==3) {
        		System.out.println("4 4 5 5");
        		System.out.println("4 3 5 -1");
        		System.out.println("1 3 3 2");
        		System.out.println("1 1 2 2");
        	}
        	else if (x==4&&y==4) {
        		System.out.println("4 4 5 -1");
        		System.out.println("4 3 5 5");
        		System.out.println("1 3 3 2");
        		System.out.println("1 1 2 2");
        	}
        }
	}

}

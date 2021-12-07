import java.util.Scanner;

public class BOJ21737 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		//System.out.print(N);
		String S = scan.nextLine();
		char[] arrChar = S.toCharArray();
		int temp = 0;
		for (int i=0;i<arrChar.length;i++) {
			if(arrChar[i] == 'C') temp ++;
		}
		if (temp==0) {
			System.out.println("NO OUTPUT");
			return ;
		}
		int result = 0;
		int tmp = 0;
		int count = 0;
		//System.out.print(S);
		for (int i=0;i<arrChar.length;i++) {
			if (arrChar[i]=='S'||arrChar[i]=='M'||arrChar[i]=='U'||arrChar[i]=='P'||arrChar[i]=='C') {
				break;
			}
			else {
				result = result*10 + (arrChar[i]-'0');
				count ++;
			}
		}
		//System.out.printf("척 값 %d ",result);
		
		//System.out.printf("arrCount[i]%d  \n",count);
		for (int i=count;i<arrChar.length;i++) {
			//System.out.printf("res %d  tmp %d\n",result,tmp);
			if (arrChar[i]=='S') {
				int j = i+1;
				while (arrChar[j]!='S'&&arrChar[j]!='M'&&arrChar[j]!='U'&&arrChar[j]!='P'&&arrChar[j]!='C') {
					tmp = tmp*10 + (arrChar[j]-'0');
					//System.out.printf("res %d  tmp %d %d %c\n",result,tmp);
					j++;
				}
				i = j-1;
				//System.out.printf("tmp %d\n",tmp);
				result = result - tmp;
				tmp = 0;
			}
			else if (arrChar[i]=='M') {
				int j = i+1;
				while (arrChar[j]!='S'&&arrChar[j]!='M'&&arrChar[j]!='U'&&arrChar[j]!='P'&&arrChar[j]!='C') {
					tmp = tmp*10 + (arrChar[j]-'0');
					j++;
					//System.out.printf("Mtmp %d\n",tmp);
				}
				i = j-1;
				
				result = result * tmp;
				tmp = 0;
			}
			else if (arrChar[i]=='U') {
				int j = i+1;
				while (arrChar[j]!='S'&&arrChar[j]!='M'&&arrChar[j]!='U'&&arrChar[j]!='P'&&arrChar[j]!='C') {
					tmp = tmp*10 + (arrChar[j]-'0');
					j++;
				}
				i = j-1;
				//System.out.printf("tmp %d\n",tmp);
				result = result / tmp;
				tmp = 0;
			}
			else if (arrChar[i]=='P') {
				int j = i+1;
				while (arrChar[j]!='S'&&arrChar[j]!='M'&&arrChar[j]!='U'&&arrChar[j]!='P'&&arrChar[j]!='C') {
					tmp = tmp*10 + (arrChar[j]-'0');
					j++;
				}
				i = j-1;
				//System.out.printf("tmp %d\n",tmp);
				result = result + tmp;
				tmp = 0;
			}
			else if (arrChar[i]=='C') {
				System.out.printf("%d ",result);
				tmp = 0;
			}
		}
	}

}
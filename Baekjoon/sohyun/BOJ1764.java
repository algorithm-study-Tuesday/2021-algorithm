import java.util.*;
public class BOJ1764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.nextLine();
		Set<String> hs = new HashSet<String>();	// 듣도 못한 사람 저장
		List<String> list = new ArrayList<String>();
		for(int i=0; i<N; i++)	
			hs.add(scan.nextLine());	// 듣도 못한 사람 저장
		
		for(int i=0; i<M; i++) {
			String str = scan.nextLine();
			// 보도 못한 사람이 듣도 못한 사람에 있을경우 => list에 저장
			if(hs.contains(str)) 	list.add(str);
		}
		
		Collections.sort(list);
		System.out.println(list.size());	// 듣도 보도 못한 사람의 수 => list의 크기
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}

}
/*
String[] listen = new String[N];
String[] see = new String[M];
for (int i=0;i<N;i++) {
	listen[i] = scan.nextLine();
}
Arrays.sort(listen);
for (int i=0;i<M;i++) {
	see[i] = scan.nextLine();
}
Arrays.sort(see);

for (int i=0;i<N;i++) {
	for (int j=0;j<M;j++) {
		if  (listen[i].equals(see[j])) arr.add(see[j]);
	}
}
System.out.println(arr.size());
for (int i=0;i<arr.size();i++) {
	System.out.println(arr.get(i));
}

*/
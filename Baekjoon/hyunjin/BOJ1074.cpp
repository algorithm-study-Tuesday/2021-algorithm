#include <bits/stdc++.h>
using namespace std;
int N,r,c;
long long answer =0;

void Input(){
	cin >> N>>r>>c;
}

void Solution(){
	//��ü ��и� ����
	int y = pow(2,N)/2;
	int x = y; // ���� 3,4�и��� �Ǵ� ��  
	
	while(N--){
		//1��и��� ��� 
		if(r < y && c<x){
			/*
			1��и� �ΰ�� �ƹ�ó������ ����
			0���� �����ϴϱ� 
			*/
		} 
		//2
		else if(r<y && c>=x){
			answer += pow(2,2*N) * 1;
			c-=x;
		} 
		
		//3
		else if(r>=y && c<x){
			answer += pow(2,2*N) * 2; // �տ� �� ��и� �����ֱ�
			r-= y;
		} 
		
		//4
		else{
			answer += pow(2,2*N) * 3;
			r-= y;
			c-=x;
		}
		y/=2;
		x/=2;
	}
	 cout<<answer;
	  
}

void Solve(){
	Input();
	Solution();
}
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
}
/*
Ǯ�� ����
https://tooo1.tistory.com/252
https://mygumi.tistory.com/284
 
*/


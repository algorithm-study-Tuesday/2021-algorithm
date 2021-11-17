#include <bits/stdc++.h>
using namespace std;
int N,r,c;
long long answer =0;

void Input(){
	cin >> N>>r>>c;
}

void Solution(){
	//전체 사분면 기준
	int y = pow(2,N)/2;
	int x = y; // 부터 3,4분면이 되는 것  
	
	while(N--){
		//1사분면인 경우 
		if(r < y && c<x){
			/*
			1사분면 인경우 아무처리하지 않음
			0부터 시작하니까 
			*/
		} 
		//2
		else if(r<y && c>=x){
			answer += pow(2,2*N) * 1;
			c-=x;
		} 
		
		//3
		else if(r>=y && c<x){
			answer += pow(2,2*N) * 2; // 앞에 두 사분면 더해주기
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
풀이 참고
https://tooo1.tistory.com/252
https://mygumi.tistory.com/284
 
*/


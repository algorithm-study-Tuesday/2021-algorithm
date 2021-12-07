#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
ll N;

void Input(){
	cin >> N;
	
}
  
ll Solution(ll n){
	if (n<=2) return n-1;
	
	ll i =1;//n보다 바로 작은 2의 제곱수 구하기 위해  
	for( ; i*2 < n ; i*=2 ) ;
	
	return !Solution(n-i); 
	/*
		f(x) : x번째 튜에모스 문자열
	 	f(x) = 1-f(x-i) 관계식 성립하게 된다.
		 	가운데를 기준으로 뒤집힌 수이기 때문에 
			이 점화식을 이용해 구현  
	*/
}

void Solve(){
	Input();
	cout<<Solution(N);
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
	// 풀이 참고 https://boomrabbit.tistory.com/100 
}

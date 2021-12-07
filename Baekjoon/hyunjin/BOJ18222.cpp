#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
ll N;

void Input(){
	cin >> N;
	
}
  
ll Solution(ll n){
	if (n<=2) return n-1;
	
	ll i =1;//n���� �ٷ� ���� 2�� ������ ���ϱ� ����  
	for( ; i*2 < n ; i*=2 ) ;
	
	return !Solution(n-i); 
	/*
		f(x) : x��° Ʃ���� ���ڿ�
	 	f(x) = 1-f(x-i) ����� �����ϰ� �ȴ�.
		 	����� �������� ������ ���̱� ������ 
			�� ��ȭ���� �̿��� ����  
	*/
}

void Solve(){
	Input();
	cout<<Solution(N);
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
	// Ǯ�� ���� https://boomrabbit.tistory.com/100 
}

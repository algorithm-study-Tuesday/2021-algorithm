#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll A,B,C;

void Input(){
	cin >> A>>B>>C;
}

ll pow(int b){
	if(b==0) return 1;
	
	ll tmp = pow(b/2);
	tmp = tmp*tmp%C;
	
	if(b % 2) return A*tmp%C;
	return tmp;
}

void Solution(){
	cout<<pow(B);
	
}
void Solve(){
	Input();
	Solution();
}
int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	Solve();
}


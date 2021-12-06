#include <bits/stdc++.h>

using namespace std;

int N,numKim,numLee; 

void Input(){
	cin>>N>>numKim>>numLee;
}

void Solution(){
	int n = N;
	int round = 1; 
	while(n>1 ){
		if( (numKim+1)/2 == (numLee+1)/2) { //현재 라운드에 만나는지 
			cout<<round;
			return;
		}
		numKim=(numKim+1)/2;
		numLee=(numLee+1)/2;
		
		n = (n+1)/2;
		round++;
	}
	cout<<"-1";
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

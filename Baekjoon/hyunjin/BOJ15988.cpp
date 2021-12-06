#include <bits/stdc++.h>
#define MAX 1000001
#define MODULER 1000000009
using namespace std;
int n;
long long dp[MAX]={0,};
void Input(){
	cin >> n;
}

void Solution(){
	dp[1] = 1;
	dp[2] = 2;
	dp[3] = 4;
	for(int i = 4; i <MAX;i++){
		dp[i] = (dp[i-1]+dp[i-2]+dp[i-3]) % MODULER;
	}
	
}


void Solve(){
	int t; cin>>t;
	Solution();
	while(t--){
		Input();
		cout<<dp[n]<<"\n";
	}
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	
	Solve();
}

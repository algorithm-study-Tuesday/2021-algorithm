#include <bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	
	
	long long dp[31]={0,1,2,5,14,};
	
	
	for(int i =5; i<=30;i++){
		dp[i] = dp[i-1]*3 -1;
	}
	
	int n;
	while(1){
		cin>>n;
		if(!n) break;
		cout<<dp[n]<<"\n";
	}
	
}

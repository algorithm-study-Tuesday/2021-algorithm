#include <bits/stdc++.h>
using namespace std;
int dp[100001]={0,3,7,};
int main(){
	ios::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	int n;
	cin>>n;
	for(int i = 3; i <= n; i++ ){
		dp[i] = dp[i-1]*2 + dp[i-2];
	}
	cout<<dp[n];
}

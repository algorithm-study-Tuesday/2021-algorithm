#include <bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	int n;
	cin>>n;
	int prices[n+1]={0,}, dp[n+1]={0,};
	
	for(int i=1;i<=n;i++)cin>>prices[i];

	for(int i = 1,min_price; i<=n;i++){
		min_price = prices[i];

		for(int j = 1; j <= i/2 ;j++){
			min_price = min(min_price,dp[i-j]+dp[j]);
		}
		dp[i] = min_price;
	}
	cout<<dp[n];
}

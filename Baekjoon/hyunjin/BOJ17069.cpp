#include <bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int n;
	cin>>n;
	int floor[n+1][n+1],dp[n+1][n+1][3]={0,};
	for(int i = 1 ; i <= n; i++){
		for(int j = 1; j <= n; j++){
			cin>>floor[i][j];
		}
	}
	dp[0][1][0]=1;
	
	for(int i = 1 ; i <= n; i++){
		for(int j = 1; j <= n; j++){
			if( floor[i][j] ) continue;
			
			
			//가로 
			for(int k = 0 ; k < 3 ; k++){
				dp[i][j][0] += (dp[i][j-1][k]+dp[i-1][j-1][k]);
			}
			
			//대각선  
			for(int k = 0 ; k < 3 ; k++){
				dp[i][j][1] += (dp[i][j-1][k]+dp[i-1][j][k]+dp[i-1][j-1][k]);
			}
			
			//세로  
			for(int k = 0 ; k < 3 ; k++){
				dp[i][j][0] += (dp[i-1][j][k]+dp[i-1][j-1][k]);
			}
			
		}
	}
	
	cout<<dp[n][n][0]+dp[n][n][1]+dp[n][n][2];
	
	
}

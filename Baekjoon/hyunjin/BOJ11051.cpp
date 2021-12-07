#include <bits/stdc++.h>
using namespace std;
long long dp[1001][1001]; //사이즈 큰건 전역으로  
int main(){
	ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
	int n,k;

	fill(&dp[0][0],&dp[1000][1001],1);

	cin>>n>>k;
	
	//(n r) = (n-1 r-1) + (n-1 r)
	for(int i = 1 ; i <= n; i++){
		for(int j = 1; j < i ; j++){
			dp[i][j] = (dp[i-1][j-1]+dp[i-1][j])%10007 ;
		}
	}
	cout<<dp[n][k]; 
}
/*
fill 2차원 배열사용법 
- https://hsdevelopment.tistory.com/221 
- https://dbstndi6316.tistory.com/283
*/

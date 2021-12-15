#include <iostream>

using namespace std;
int dp[41][2]={1,0,0,1,};

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	
	
	for(int i = 2 ; i <=40 ; i++){
		dp[i][0] = dp[i-1][0] + dp[i-2][0];
		dp[i][1] = dp[i-1][1] + dp[i-2][1];
	}
	
	int testCase;
	cin>>testCase;
	while(testCase--){
		int num;cin>>num;
		
		cout<<dp[num][0]<<" "<<dp[num][1]<<"\n";
	}
	
}

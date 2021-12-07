#include <bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
	string str1,str2;
	int len1,len2;
	cin>>str1>>str2;
	len1 = str1.length();
	len2 = str2.length();
	int dp[len2+1][len1+1]={0,};
	fill(&dp[0][0],&dp[len2][len1+1],0);

	int answer=0;
	
	for(int i=1; i <= len2; i++){
		char c2 = str2[i-1];
		for(int j = 1; j <= len1;j++){	
			if(c2 == str1[j-1]){//이것만 하면  Longest Common Substring
				dp[i][j] = dp[i-1][j-1]+1;
				
			}
			else{
				dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
			}
			answer = max(answer,dp[i][j] );	
			
		}
	}
	
	cout<<answer<<endl;	
}


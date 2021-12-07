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

	int max_len=0,max_y,max_x;
	string answer_str="";
	
	for(int i=1; i <= len2; i++){
		char c2 = str2[i-1];
		for(int j = 1; j <= len1;j++){	
			if(c2 == str1[j-1]){
				dp[i][j] = dp[i-1][j-1]+1;
				
			}
			else{
				dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
			}
			
			if(max_len < dp[i][j]){
				max_len = dp[i][j];
				max_y = i;
				max_x = j;
			}

		}
	}
	
	for(int i = max_len; i>0;i--){
		if(dp[max_y-1][max_x] == i){
			max_y--;
			i++;
		}
		else if(dp[max_y][max_x-1] == i){
			max_x--;
			i++;
		}
		else{
			answer_str = str1[max_x-1] + answer_str ;
			max_x--;
			max_y--;
		}
	}
	
	cout<<max_len<<"\n"<<answer_str;
		
}

/*
https://velog.io/@emplam27/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B7%B8%EB%A6%BC%EC%9C%BC%EB%A1%9C-%EC%95%8C%EC%95%84%EB%B3%B4%EB%8A%94-LCS-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Longest-Common-Substring%EC%99%80-Longest-Common-Subsequence
*/


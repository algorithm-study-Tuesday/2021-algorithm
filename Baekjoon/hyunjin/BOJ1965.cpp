#include <iostream>
#include <cstring>
#include <algorithm>//max_element
#define MAX 1000
using namespace std;
int N;
int dp[MAX]={0,};
int box[MAX]; 
int ans=0;
//최대 증가 수열 찾는 문제 

void Input(){
	cin>>N;
	for(int i = 0 ; i<N;){
		cin>>box[i++];
	}
}

void Solution(){

	fill_n(dp,N,1); // 0,false이외는 fill로  
	for(int i = N-2; i>=0 ;i--){
		int current = dp[i];
		for(int j = i+1; j < N ; j++){
			if(box[i] < box[j]){
			//	cout<<i <<" "<< j <<endl;
				dp[i] = max(dp[i], current+ dp[j]);
			}
				
		}
	}
	
//	
//	for(int i = N-1; i>=0 ;i--){
//		cout<<dp[i]<<endl;
//	}
	
}

void Solve(){
	Input();
	
	Solution();
	cout<<*max_element(dp,dp+N);
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
}

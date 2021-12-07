#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
	ios::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	int k,n;
	cin >> k >>n;
	ll lan[k];
	for(int i = 0 ; i < k ; i++) cin>>lan[i]; 
	
	ll lower=1,upper = *max_element(lan,lan+k);
	ll answer = 0;//N개 이상 랜선 만들 수 있는 최대 길이  
	while(lower<=upper){	
		ll mid = (lower + upper)/2;
		int lan_cnt = 0;
		for(auto e : lan) lan_cnt += (e/mid);
		
		if(lan_cnt>= n){
			answer = answer < mid ? mid : answer;
			lower = mid+1;	
		}
		else{
			upper = mid-1;
		}
	}
	cout<<answer ;	
}

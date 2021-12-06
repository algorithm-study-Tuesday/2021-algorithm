#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,total_budget;
int main(){
	ios::sync_with_stdio(0); cin.tie(0);cout.tie(0);

	cin >> n;
	ll budget[n];
	for(int i = 0 ; i < n ; i++) cin>>buget[i];
	cin>> total_budget;
	ll l = 1,u=total_budget;
	ll answer = 0;
	while(l<=u){
		ll mid = (l+u)/2;
		ll ramain_budget = total_budget;
		for(auto e:budget){
			if(e<=mid){//상한 이하 
				ramain_budget -= e;
			}
			else ramain_budget-= mid;
			if(ramain_budget < 0)break;
		}
		
		
		
		
		
	}
	
	
}

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,k;
ll level[1000001];
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	cin >>n>>k;
	for(int i = 0 ; i < n ; )cin>>level[i++];
	
	ll T = 0;//∆¿ ∏Ò«• ∑π∫ß 
	ll l = *min_element(level,level+n);
	ll u = *max_element(level,level+n)+k; 
	while(l<=u){
		ll mid = (l+u)/2;
		ll tmp=0;
		for(int i = 0 ; i < n ; i++){
			tmp += level[i] < mid? mid-level[i] : 0;
		}
		
		if(tmp <= k){
			l = mid+1;
			T = T < mid ? mid : T;
		}
		else{
			u=mid-1;
		}
		
	}
	cout<<T;
	 
	
	
}

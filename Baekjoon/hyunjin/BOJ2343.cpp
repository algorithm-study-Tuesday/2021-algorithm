#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int n,m;//강의 수,블루레이 수  
	cin>>n>>m;
	vector<ll> classes(n);
	for(int i = 0,tmp ; i < n;)	cin>>classes[i++];
	
	ll l=*max_element(classes.begin(),classes.end());
	ll u= 987654321;

	while(l<=u){
		int mid = (l+u)/2;
		
		ll cnt=0,sum = 0;//블루레이 개수 , 길이합 
		for(int e : classes){
			if(sum + e > mid){ //블루레이 길이 초과하면 새 블루레이로  
				sum = 0;
				cnt++;
			}
			sum += e;
		}
		if(sum) cnt++;//마지막 남은 블루레이 있으면 개수 추가  
		
		if(cnt > m){		
			l = mid+1;
		}
		else{//cnt < m
			u = mid-1;
		}
	}	

	cout<<l;
}

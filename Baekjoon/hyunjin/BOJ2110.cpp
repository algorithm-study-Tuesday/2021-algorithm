#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,c;//집,공유기  
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	cin>>n>>c;
	ll house[n];
	for(int i = 0; i < n ; )cin>>house[i++];
	sort(house, house+n);
	
	ll l = 1,u=house[n-1];
	ll answer = 0;
	while(l<=u){
		int mid = (l+u)/2; //거리
		
		stack<int> s;
		s.push(house[0]);
		for(int i =1 ; i < n ; i++){
			if(house[i] - s.top() >= mid){
				s.push(house[i]);
			}
		}
		if(s.size() >= c){
			answer = answer < mid ? mid : answer;
			l = mid+1;
		}
		else u =mid-1;

	}
	
	cout<<answer;	
	
	
}

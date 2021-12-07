#include <bits/stdc++.h>
using namespace std;

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0); cout.tie(0);		
	int n,m,p_pos=0;
	cin >> n >> m; 
	int dis[n];
	for(int i = 0 ; i < n ;i++){
		cin>>dis[i];
		if(dis[i]<0) p_pos++;
	}
	sort(dis,dis+n);
	
	int result = 0;
	for(int i = n-1; i>= p_pos ;i-=m){
		result += (dis[i]*2);
	}
	for(int i = 0; i< p_pos ;i+=m){
		result += (abs(dis[i]*2));
	}
	
	result -= max(dis[n-1], abs(dis[0]) );
	cout<<result;

	
}

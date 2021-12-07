#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int cnt_people,cnt_snack;//m명 n개
	cin>>cnt_people>>cnt_snack;
	ll snack[cnt_snack];
	for(int i = 0 ; i < cnt_snack ;) cin>>snack[i++];
	sort(snack,snack+cnt_snack);
	int l = 1, u = snack[cnt_snack-1];
	int answer = 0;//최대길이  
	
	while(l<=u){
		int mid = (l+u)/2;
		int available_sanck=0;
		
		for(int e : snack){
			available_sanck += e/mid;
		}
		
		
		if( available_sanck >= cnt_people ){
			answer = answer < mid ? mid : answer;
			l = mid+1;
		}
		else u = mid - 1;
	}	
	 cout<<answer;
	
}

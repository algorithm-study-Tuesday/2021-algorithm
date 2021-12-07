#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int cnt_greenonion,cnt_chick;//ÆÄ,ÆÄ´ß ¼ö  
	cin>>cnt_greenonion>>cnt_chick;
	ll onion[cnt_greenonion];
	for(int i = 0 ; i < cnt_greenonion; )cin>>onion[i++];
	sort(onion,onion+cnt_greenonion);
	ll l=1,u=onion[cnt_greenonion-1];
	ll answer=0,max_len_onion=0;
	
	while(l<=u){
		int mid = (l+u)/2;
		int cnt=0;
		for(int e : onion){
			cnt += e/mid;
		}	
		
//		cout<<l<<"~"<<u<<": "<<mid;
		
		if(cnt>=cnt_chick){
			max_len_onion = max_len_onion<mid ? mid : max_len_onion;
			l = mid+1; 
		}
		else u = mid-1;	
//		cout<<"  " << cnt <<" , "<<max_len_onion<<endl;
	}
//	cout<<"onino : "<<max_len_onion<<endl;
	for(int e : onion){
		answer +=e;
	}
	answer -= max_len_onion*cnt_chick;
	cout<<answer;
		
}

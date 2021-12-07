#include <bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	string s;
	int num_cnt[10]={0,};
	cin>>s;
	for(auto c : s){
		num_cnt[c-'0']++;
	}
	int max_cnt= 0,six_nine_cnt=0;
	for(int i = 0 ; i < 10 ; i++){
		if(i ==6 || i == 9){
			six_nine_cnt +=num_cnt[i];
		}
		else max_cnt = max(max_cnt,num_cnt[i]);
	}
	int answer = max( max_cnt,  (int)ceil((float)six_nine_cnt/2.0) );//반올림함수  
	cout<<answer;
}

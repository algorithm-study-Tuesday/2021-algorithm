#include <iostream>
#include <map>
#include <vector>
#include <algorithm>
using namespace std;
int N,C;
map<int,int> freq;//빈도 저장  
map<int,int> order; //등장 순서 
vector<pair<int,int>> ans;//빈도 숫자   
bool cmp(pair<int,int>a,pair<int,int>b){
	if(a.first==b.first) return order[a.second] < order[b.second];
	return a.first > b.first;
} 


int main(){
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	cin>>N>>C;
	for(int i = 0 ; i < N ; i++){
		int num; cin>> num;
		freq[num]++;
		if(!order[num]) order[num] = i+1;//순서 저장 
	}
	for(auto e : freq){
		ans.emplace_back(e.second,e.first);
	}
	sort(ans.begin(),ans.end(),cmp);
	for(auto e : ans){
		for(int i = 0 ; i < e.first; i++){
			cout<<e.second<<" ";
		}
	}
	
	
}

//#include <iostream>
//#include <queue>
//#include <utility>
#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
typedef pair<ll,int> pii;
ll input_num,target_num,result=0;

//
//void DFS(int current_num, int depth){
//	if(current_num == target_num){
//		cout<<depth;
//		return;
//	}
//	
//	if(current_num*2 <=target_num) DFS(current_num*2,depth+1);
//	if(current_num*10+1 <=target_num) DFS(current_num*10+1,depth+1);
//}

void BFS(){
	queue<pii> q;
	q.push({input_num,1} );
	while(!q.empty()){
		ll current_num = q.front().first;
		int current_depth = q.front().second;
		
		if(current_num == target_num){
			cout<<current_depth;
			return;
		}
			
		if(current_num*2 <= target_num) q.push({current_num *2,current_depth+1});
		if(current_num*10 + 1 <= target_num) q.push({current_num*10 + 1,current_depth+1});
		q.pop();
	}
	cout<<"-1";
}

int main(){
	ios::sync_with_stdio(false);cin.tie(0);cout.tie(0);
	cin >> input_num>>target_num;
	//DFS(input_num,1);
	BFS();
	
}

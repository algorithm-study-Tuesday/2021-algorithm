#include <bits/stdc++.h>
#define MAX 10001
using namespace std;
int N,M;
//int disBetweenNodes[MAX][MAX]={0,};
vector<pair<int,int>> disBetweenNodes[MAX];
int visited[MAX]={0,};
void Input(){
	cin>>N>>M;
	for(int i = 0 ; i < N-1 ; i++){
		int from,to,dis;
		cin>>from>>to>>dis;
		disBetweenNodes[from].push_back({to,dis});
		disBetweenNodes[to].push_back({from,dis});
//		disBetweenNodes[from][to]=dis;
//		disBetweenNodes[to][from]=dis;
	}
}

void BFS(int from,int to){
	queue<pair<int,int>> q;//현노드,from에서현노드까지 거리 
	q.push({from,0});
	visited[from]=true;
	
	while(!q.empty()){
		int currentNode=q.front().first, dis=q.front().second;
		q.pop();
		
		if(currentNode == to){
			cout<<dis<<"\n";
			return;
		}
		
		for(auto e : disBetweenNodes[currentNode] ){
			if(!visited[e.first]){
				q.push({e.first, e.second + dis});
				//다음노드, 기존거리+다음 노드까지 거리
				visited[e.first]=true; 		
			}
		}
		
	}
}

void Solve(){
	Input();
	while(M--){
		memset(visited,false,sizeof(visited));
		int from,to;
		cin>>from>>to;
		BFS(from,to);
	}
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);	
	Solve();
}

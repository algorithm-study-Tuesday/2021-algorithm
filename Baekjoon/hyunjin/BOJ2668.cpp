#include <bits/stdc++.h>

using namespace std;

int n;
int arr[101];
bool visited[101]={0,};
vector<int> ans;

void BFS(int startNode, int currentNode){
	if(visited[currentNode]){
		if(currentNode == startNode) 
			ans.push_back(currentNode);
		return;
	}
	visited[currentNode] = true;
	BFS(startNode,arr[currentNode]);

}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int n; 
	cin >>n;
	
	for(int i = 1 ; i <= n ;i++) cin >> arr[i];

	for(int i = 1 ; i <= n; i++){
		memset(visited,0,sizeof(visited));
		BFS(i,i);
	}
	cout<<ans.size()<<"\n";
	for(auto e : ans) cout<< e << "\n";
	
}

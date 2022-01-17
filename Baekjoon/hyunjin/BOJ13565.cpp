#include <iostream>
using namespace std;

#define MAX 1000
int W,H;
int map[MAX][MAX];
int dx[4] ={0,0,1,-1},dy[4] = {1,-1,0,0};
bool Visited[MAX][MAX]={0,};
void Input(){
	cin>>H>>W;
	for(int i = 0 ; i < H ; i++){
		string s;
		cin>>s;
		for(int j = 0 ; j < W ; j++){
			map[i][j]=s[j]-'0';
		}
	}
}

void DFS(int y, int x){
	if(y < 0 or y>= H or x <0 or x >= W) return;
	if(map[y][x]==1 or Visited[y][x]) return;
	
	map[y][x] = 2;//전류로 흐름
	Visited[y][x] = true;
	for(int i = 0 ; i < 4 ; i++)
		DFS(y+dy[i], x+dx[i]);
}

void Solution(){
	for(int j = 0 ; j < W; j++) 
		if(!map[0][j]) DFS(0,j);
	
	for(int j = 0 ; j < W ;j++){
		if(map[H-1][j] == 2){
			cout<<"YES\n"; return;
		}
	}
	cout<<"NO\n";	
	
//	for(int i = 0 ; i < H ; i++){
//		for(int j = 0 ; j < W ; j++){
//			cout<< map[i][j];
//		}
//		cout<<"\n";
//	}
}

void Solve(){
	Input();
	Solution();
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
}

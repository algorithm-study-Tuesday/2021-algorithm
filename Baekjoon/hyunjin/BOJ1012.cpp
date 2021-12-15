//2차원 memset 주로 0초기화 할때  
#include <iostream>
#include <cstring> //memset
#define MAX 50
using namespace std;

int dp[MAX][MAX]={0,};
bool visited[MAX][MAX]={0,};
int H,W,k;
int testCase;
int answer = 0;

void Init(){
	memset(visited,0,sizeof(visited)); 
	memset(dp,0,sizeof(dp));
	answer = 0;	
}

void DFS(int y, int x){
	if(y<0 or y>=H or x<0 or x>=W) return; 
	if(visited[y][x] or !dp[y][x]) return;	
	visited[y][x] = true;
	int dy[4] = {1,-1,0,0};
	int dx[4] = {0,0,1,-1};
	for(int i = 0 ; i < 4 ;i++)
		DFS(y+dy[i],x+dx[i]);
}

void Solve(){
	int testCase; cin>>testCase;
	while(testCase--){
		Init();
		cin >> H>> W >> k;
		while(k--){
			int i,j; cin >> i>> j;
			dp[i][j] = 1;		
		}

		for(int y = 0 ; y < H ; y++){
			for(int x = 0 ; x < W ; x++){
				if(!visited[y][x] and dp[y][x]){	
					DFS(y,x);
					answer++;				
				}
			}
		}		
		cout<<answer<<"\n";	
	}	
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
}

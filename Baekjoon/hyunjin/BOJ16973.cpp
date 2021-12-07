#include <bits/stdc++.h>
using namespace std;
int n,m,h,w,sy,sx,fy,fx,ans=0;
int board[1001][1001]={0,};
bool visited[1001][1001]={0,};
void dfs(int y, int x, int depth){
	if(y+h>n || y<1 || x+w>m || x <1) return;
	for(int i = 0;i<=n;i++){
		if(board[y+i][x] || board[y+i][x+w] ) return;
	}
	for(int j = 1; j<=m;j++){
		if(board[y][x+j] || board[y+h][x+j] ) return;
	}
	if(y==fy and x==fx) {
		cout<<depth;
		return;
	}
	int dx[]={0,0,1,-1},dy[]={1,-1,0,0};
	for(int k = 0 ; k < 4 ; k++){
		dfs(y+dy[k],x+dx[k],depth+1);
	}

}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	cin>>n>>m;
	for(int i = 0 ; i <= n; i++){
//		cout<<i<<endl;
		string s;
		getline(cin,s);
		for(int j = 0; j < s.length(); j += 2){
			if(s[j]=='1'){
//				cout<<"("<<i<<","<<j<<")\n"; 
				board[i][j/2+1]=1;	
			}
		}
	}
	cin>>h>>w>>sy>>sx>>fy>>fx;
	
//	for(int i = 1 ; i <= n; i++){
//		for(int j =1;j<=m ;j++){
//			cout<<board[i][j]<<" ";
//		}
//		cout<<"\n";
//	}
	

	dfs(sy,sx,0);
}

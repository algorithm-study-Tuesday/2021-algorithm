#include<iostream>
#include <cstring>
#include <string>

using namespace std;
#define MAX 130
int image[MAX][MAX]={0,};
bool Visited[MAX][MAX]={0,};
int H,W,Q;
int dy[4] = {0,0,1,-1};
int dx[4] = {1,-1,0,0};

void Input(){
	cin>>H>>W;
	for(int i = 1; i <= H; i++){
		for(int j = 1 ; j<= W ;j++){
			cin>>image[i][j];
		}
	}
	cin>>Q;
}

void DFS(int y, int x, int targetColor ,int color2Change){
	if(y<1 or y>H or x<1 or x>W) return;
	if(Visited[y][x] or image[y][x] != targetColor) return;
	Visited[y][x] = true;
	image[y][x] = color2Change;
	for(int i = 0 ; i < 4 ;i++){
		DFS(y+dy[i],x+dx[i],targetColor,color2Change );
	}
}

void Solve(){
	Input();
	int y, x, color;
	while(Q--){
		memset(Visited,0,sizeof(Visited));
		cin>> y >> x >> color;
		DFS(y,x, image[y][x] ,color);
	}

	 for(int i = 1; i <=H;i++){
	 	for(int j = 1 ; j<= W ;j++){
	 		cout<<image[i][j]<<" ";
	 	}
	 	cout<<"\n";
	 }
}

int main(int argc, char** argv)
{
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
	return 0;
}

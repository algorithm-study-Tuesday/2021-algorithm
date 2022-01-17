#include <iostream>
using namespace std;

#define MAX 1000
int W,H, T; // T : 경계값  
int image[MAX][MAX]={0,};
int dx[4] ={0,0,1,-1},dy[4] = {1,-1,0,0};
bool Visited[MAX][MAX]={0,};
int objectCnt = 0;

void Input(){
	cin>>H>>W;
	for(int i = 0 ; i < H ; i++){
		for(int j = 0 ; j < 3*W ; j++){
			int c; cin>>c;
			image[i][j/3] += c; // RGB RGB 이렇게 들어옴. 
		}
	}
	cin>>T; 

}

void DFS(int y, int x){
	if(y < 0 or y>= H or x <0 or x >= W) return;
	if(!image[y][x] or Visited[y][x]) return;
	
	Visited[y][x] = true;
	for(int i = 0 ; i < 4 ;i++)	DFS(y+dy[i],x+dx[i]);
}

void Solution(){
	for(int i = 0 ; i < H ; i++){
		for(int j = 0 ; j < W ; j++){
			image[i][j] =(image[i][j]/3 >= T ) ?  255 : 0;
		}
	}
	
	for(int i = 0 ; i < H ; i++){
		for(int j = 0 ; j < W ;j++){
			if(!Visited[i][j] and image[i][j] ){
				DFS(i,j);
				objectCnt++;
			} 
		}
	}
	cout<<objectCnt<<"\n";
}

void Solve(){
	Input();
	Solution();
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
}

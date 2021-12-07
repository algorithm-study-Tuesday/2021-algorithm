//https://kangminjun.tistory.com/entry/BOJ-1245%EB%B2%88-%EB%86%8D%EC%9E%A5-%EA%B4%80%EB%A6%AC
#include <bits/stdc++.h>
using namespace std;
int h,w;
int land[101][71];
bool isPeak[101][71]={0,};
bool visited[101][71]={0,};
int answer = 0;
void Input(){
	cin>>h>>w;
	for(int i = 0; i < h ; i++)
		for(int j = 0 ; j < w ; j++)
			cin>>land[i][j];
}

int dx[] = {0,0,1,-1,-1,-1,1,1},dy[] = {1,-1,0,0,-1,1,1,-1};
bool DFS(int y,int x){
	visited[y][x] = true;
	for(int i = 0 ; i < 8 ;i++){
		int ny = y+dy[i],nx = x+ dx[i];
	
		if(ny <0 || ny>h || nx<0 || nx >w) continue;
		
		if(land[y][x] < land[ny][nx]) return false;
		
		if(!visited[ny][nx] && land[y][x] == land[ny][nx]) {
			visited[ny][ny]=true;
			if(!DFS(ny,nx)) return false;
		}
	}
	return true;
}

bool BFS(int y,int x){
	for(int i = 0 ; i < 8 ;i++){
	 	int around_y = y+dy[i], around_x = x + dx[i]; //주변 위치  
		 
		 //지도 범위 내 
	 	if(around_y<0 || around_y > h|| around_x<0 || around_x>w) continue;
	 	
	 	//더 높은 곳 존재  
		if(land[y][x] < land[around_y][around_x]) return false;
		
	 	//같은 높이
		if(land[y][x] == land[around_y][around_x]) {
			//그곳 이미 방문했고 정상이면 카운트 안하고 넘어가야하니까
			if(isPeak[around_y][around_x]){
				isPeak[y][x]=true;
				return false;
			}	
		} 
		 
		 
	 }
	
	isPeak[y][x]=true;
	return true; 

}

void Solution(){
	for(int i = 0; i < h ; i++){
		for(int j = 0 ; j < w ; j++){
			if(!land[i][j]&& !visited[i][j]) {//높이 1이상이고 방문 안했다면  
				if( DFS(i,j)){
					answer++;	
				} 
				
			}
		}
	}
	cout<<answer;
}
void Slove(){
	Input();
	Solution();
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Slove();
}

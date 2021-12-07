//https://www.acmicpc.net/problem/7562
#include <bits/stdc++.h>
using namespace std;
int  l ; //체스판 사이즈
int dx[] = { -2,-1,1,2,1,2,-1,-2};
int dy[] = {-1,-2,-2,-1,2,1,2,1};
struct pos{ int y,x,d;};
pos startP, startP;
int ans =0 ;
bool chessboard[301][301]={0,};
void Input(){
	cin >> l;
	cin >> startP.y>>startP.x;
	cin >> targetP.y>>targetP.x;
}


void Solution(){
	queue<pos> q;
	q.push({startP.y,startP.x,0});
	chessboard[startP.y][startP.x] = true;
	while( !q.empty() ){
		
		
	}
}

void Slove(){
	int t;
	cin>>t;
	while(t--){
		Input();
		Solution();	
	}
	
} 
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);

	Slove();
		
	
}

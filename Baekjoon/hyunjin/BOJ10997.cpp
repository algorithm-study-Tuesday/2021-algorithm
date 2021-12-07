#include <bits/stdc++.h>
using namespace std;
char star[401][401]={0,};

void DrawStar(int n, int y, int x){
	if(n==1){
		star[y][x]='*';
		star[y+1][x]='*';
		star[y+2][x]='*';
		return;
	}
	
	// 1번 윗변 3번 아랫변  
	for(int i = x ;  i > x - (4*n -3) +1 ;i-- ) {
		star[y][i] = '*';
		star[y+4*n-2][i] = '*';
	}
	
	//2번 4번
	for(int i = y+2; ; i++){
		star[i][x - 4*n +4]='*';
		star[i][x]='*';
	}
	star[y+1][x - 4*n +4] = '*';
	
	//5번
	star[y+1][x-1]='*';
	
	DrawStar(n-1, y+2,x-2);
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int n;
	fill(&star[0][0], &star[400][401],' ');
	cin>>n;
	if(n==1){
		cout<<"*";
		return 0;
	}
	int w = 4*n-3, h = w+2;;
	DrawStar(n ,0 ,w-1);
	
//	for(int j = 1; j < 4*n-3 ; j++) star[1][j] = '\u0000';
	
	//출력
	string ans;
	for(int i = 0 ; i < 4*n-1 ; i++){
		if(i==1){
			cout<<"*\n";
//			ans +="*\n";
			continue;
		}
		for(int j = 0 ; j < w ;j++){
			cout<<star[i][j];
//			ans+=star[i][j];
			
		}
//		cout<<"\n\n";
		cout<<"\n";
//		ans+="\n";
	}
//	cout<<ans; 	
	
}

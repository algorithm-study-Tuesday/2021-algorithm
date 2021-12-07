//움직이는 방향만 잘 고치면 됫듯  
#include <bits/stdc++.h>
using namespace std;
int d[][2] ={{-1,0},{0,-1},{1,0},{0,1} }; //위 왼쪽 아래 오른 
int N,target; 
int ans_x,ans_y;
int arr[1000][1000];
void Snail(int n,int y,int x){
	if(n==1){
		arr[y][x]=1;return;
	}
	int cnt = 2*n-1;
	int dir = (n%2) * 2; // 방향 , 곱할까도 생각했지만 단순하게 가자  
	
	arr[y][x] = n*n;
	for(int i = 1 ; i <= 2*n-2  ;i++){
		if(i==n) dir++;
		y = y+d[dir][0];
		x = x+d[dir][1]; 
		arr[y][x]= n*n-i;
		if(n*n-i==target){
			ans_y = y; ans_x = x;
		}
	}

	//다음 시작위치 넘기기  
	y = (n%2==1 )? y-1 : y+1;	
	Snail(n-1,y ,x );
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
 	cin>>N>>target;
	//시작 위치 넘기기 
	Snail(N, 0,0); 
	
	for(int i = 0 ; i < N;i++){
		for(int j = 0 ; j< N ;j++){
			cout<<arr[i][j]<<" ";
		}
		cout<<"\n";
	}
	cout<<ans_y+1<<" "<<ans_x+1;
}

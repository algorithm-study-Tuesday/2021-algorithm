//풀이 참고 https://yabmoons.tistory.com/648 
#include <bits/stdc++.h>
#define MAX 130
#define endl "\n"
using namespace std;
int n;
int paper[MAX][MAX];
int White=0,Blue=0;

void Input(){
	cin>>n;	
	for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            cin >> paper[i][j];
        }
    }
}
void DFS(int y,int x, int size){
	bool Zero=true, One=true;
	for(int i = y ; i < y + size ; i++){
		for(int j = x; j < x + size; j++){
			paper[i][j] ? Zero = false : One = false;
		}
	} 
	if(Zero){
		White++;return;
	}
	if(One){
		Blue++;return;
	}
	DFS(y, x, size/2);
	DFS(y + size/2, x, size/2);
	DFS(y, x + size/2, size/2);
	DFS(y + size/2, x + size/2, size/2);
}

void Solution(){
	DFS(0,0,n);
	cout << White << endl << Blue;
}

void Solve(){
	Input();
	Solution();
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	
	Solve();	
}

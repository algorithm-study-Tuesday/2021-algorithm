#include <bits/stdc++.h>
#define MAX 2190
#define endl "\n"
using namespace std;
int N;
int MAP[MAX][MAX];
int answer[3]={0,};//-1 0 1
void Input(){
	cin>>N;
	for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++){
            cin >> MAP[i][j];
        }
    }
}
void DFS(int y,int x, int size){
	bool MOne = true, Zero= true, POne = true;
	
	for(int i = y ; i < y + size ; i++){
		for(int j = x; j < x + size; j++){
			if(MAP[i][j] == -1){
				Zero = false; POne = false;
			}
			else if(MAP[i][j] == 0){
				MOne = false; POne = false;
			}
			else{
				MOne = false; Zero = false;
			}
		}
	} 
	
	if(MOne){
		answer[0]++;return;
	}
	if(Zero){
		answer[1]++;return;
	}
	if(POne){
		answer[2]++;return;
	}
	
	for( int i=0 ; i<3; i++){
		for( int j=0 ; j<3; j++){
			DFS( y + size*i/3 , x + size*j/3 , size/3);
		}
	}
}
void Solution(){
	DFS(0,0,N);
	for(int i = 0 ; i < 3 ; i++) cout<<answer[i]<<endl;
}
void Solve(){
	Input();
	Solution();
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	
	Solve();	
}

#include <bits/stdc++.h>
using namespace std;
int N;
int MAP[65][65];

void Input(){
	cin >> N;
	for (int i = 0; i < N; i++){
		string s;cin>>s;
        for (int j = 0; j < s.length(); j++){
            MAP[i][j] = s[j]-'0';
        }
    }
}

void DFS(int y, int x ,int size){
	if(size==1){
		cout<<MAP[y][x];return;
	}
	
	
	bool Zero=true,One=true;
	for(int i = y ; i < y + size; i++){
		for(int j = x; j < x + size; j++){
			MAP[i][j] ? Zero = false : One = false;
		}
	}
	if(Zero){
		cout<<"0";
		return;
	}
	if(One){
		cout<<"1";
		return;
	}
	cout<<"("; // 위쪽 아닌 여기 있어야함, 전체가 다 0or1이면 () 없이 바로 출력해야하기 때문  
	DFS(y, x, size/2);
	DFS(y, x+size/2, size/2);
	DFS(y+size/2, x, size/2);
	DFS(y+size/2, x+size/2, size/2);
	
	cout<<")";
}

void Solution(){
	DFS(0,0,N);
}

void Solve(){
	Input();
	Solution();
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
}

#include <bits/stdc++.h>

using namespace std;
#define MAX 1001
int N;
int matrix[MAX][MAX];
int num[MAX]= {0,};
void Input(){
	cin>>N;
	for(int i = 1 ; i <= N ; i++){
		for(int j = 1 ; j <= N ; j++){
			cin>>matrix[i][j];
		}
	}
}

void Solution(){
	
	for(int i = 1 ; i <= N ; i++){
		for(int j = i+1 ; j <= N; j++){
			num[i] |= matrix[i][j]; 
			num[j] |= matrix[i][j];
		}
	}
	
}

void Solve(){
	Input();
	Solution();
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
	for(int i = 1 ; i <= N ;i++) cout<<num[i]<<" ";
}

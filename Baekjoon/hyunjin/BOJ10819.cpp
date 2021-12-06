#include <bits/stdc++.h>
using namespace std;
int N;
int Arr[8];
bool Selected[8]={0,};
vector<int> V;
int answer=0;


void Input(){
	cin>>N;
	for(int i = 0 ;i < N ; i++){
		cin>>Arr[i];
	}
}

void DFS(int Cnt){
	if(Cnt==N){
		int sum=0;
		for(int i =0; i < N-1 ;i++){
			sum+= abs(V[i]-V[i+1]);
		}
		answer = answer < sum ? sum : answer;
	}
	
	for(int i = 0 ; i < N ; i++){
		if(Selected[i]) continue;
		Selected[i]=true;
		V.push_back(Arr[i]);
		DFS(Cnt+1);
		Selected[i]=false;
		V.pop_back();		
	}	
}

void Solution(){
	sort(Arr,Arr+N);
	DFS(0);
	cout<<answer;
	
}
void Solve(){
	Input();
	Solution();
}
int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	Solve();
}

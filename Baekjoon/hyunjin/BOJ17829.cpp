#include <bits/stdc++.h>
#define endl "\n"
#define MAX 1024
using namespace std;
int N;
int image[MAX][MAX];
void Input(){
	cin>>N;
	for(int i = 0; i < N; i++){
		for (int j = 0; j < N; j++){
            cin >> image[i][j];
        }
	}	
}

//2X2 2번째 큰 수 리턴 
int Pooling(int y, int x){
	vector<int> v;
	for(int i = y ; i < y+2 ; i++){
		for(int j = x ; j < x+2 ; j++){
			v.push_back(image[i][j]);
		}
	}
	sort(v.begin(),v.end());
	return v[2];
}

void Solution(){
	int size = N;
	while(size > 1){
		for(int i = 0 ; i < size ; i+=2){
			for(int j = 0 ; j < size; j+=2 ){
				image[i/2][j/2] = Pooling(i,j);
			}
		}
		size/=2;
	}
	cout<<image[0][0];
}
void Solve(){
	Input();
	Solution();
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	
	Solve();	
}

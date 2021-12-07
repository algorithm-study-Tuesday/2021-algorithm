#include <bits/stdc++.h>

using namespace std;

int X,Y,Z;
float answer;

void Input(){
	cin>>X>>Y>>Z;
}




void Solution(){
	answer = (-1*Z + sqrt( Z*Z - 4 *Z*(2*X - 2 * Y ) ) ) / (2.0 * (float)Z );
	cout<<ceil(answer)<<"\n";
}

void Slove(){
	int T;
	cin>>T;
	while(T--){
		Input();
		Solution();	
	}
}

int main(){
	ios::sync_with_stdio(false);cin.tie(0);cout.tie(0);
	
	Slove();
	
	return 0;
}


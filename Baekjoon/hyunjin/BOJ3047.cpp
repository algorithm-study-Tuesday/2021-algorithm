#include <bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int abc[3];
	string s;
	cin>>abc[0]>>abc[1]>>abc[2];
	cin >>s;
	sort(abc,abc+3);
	
	for(char c : s){
		cout<<abc[c-'A']<<" ";
	}
}

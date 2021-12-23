#include <iostream>
#include <string>

using namespace std;

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int m;cin>>m;
	
	string op;
	int val, BIT = 0;
	while(m--){
		cin>>op;
		if(op == "all"){
			BIT = (1<<21)-1;
			continue;
		}
		else if(op == "empty"){
			BIT = 0; 
			continue;
		}
		
		cin>>val;
		if(op=="add"){
			BIT |= (1<<val);
		}
		else if(op=="remove"){
			BIT &= ~(1<<val);
		}
		else if(op=="check"){
			(BIT & (1<<val)) ? cout<<"1\n" : cout<<"0\n";
		}
		else if(op=="toggle"){
			BIT ^= (1<<val);
		}
		
	}
}
//풀이 참고 https://donggoolosori.github.io/2020/09/24/boj-11723/ 

#include <bits/stdc++.h>
using namespace std;
int L,C;
vector<char> alphabet,vec;
bool Selected[30] = {0,};

void Input(){
	cin>>L>>C;
	for(int i = 0 ; i < C; i++){
		char c;cin >> c;
		alphabet.push_back(c);
	}
}

bool CheckPWCondition(){
	bool v=false;
	int num_c=0;
	for(auto e : vec){
		if(e =='a'|| e =='e'|| e =='i'|| e =='o'|| e =='u' ) v = true;
		else num_c++;
		if(v && num_c >=2) return true;
	}
	return false;
}

void DFS(int len, int start){//중복피하기위해 시작지점 필요  
	if(len == L){
		if(CheckPWCondition()){
			string s;
			for(auto e:vec) s+=e;
			cout<<s<<"\n";
		}
	}
	else{
		for(int i = start ; i < C ; i++){
			if(Selected[i])continue;
			Selected[i]=true;
			vec.push_back(alphabet[i]);
			DFS(len+1,i); // 여기서 start +1 이 아닌 해당 지점 i 넣어줘야함!! 
			Selected[i]=false;
			vec.pop_back();
		}
	}		
}

void Solution(){	
	sort(alphabet.begin(),alphabet.end());
	DFS(0,0);
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


//조합  참고 https://yabmoons.tistory.com/99
/*
이미 알파벳 순서는 정해져 있고 뽑기만 하면 되는 문제기 대문에
 
*/

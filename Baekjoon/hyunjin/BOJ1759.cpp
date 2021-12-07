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

void DFS(int len, int start){//�ߺ����ϱ����� �������� �ʿ�  
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
			DFS(len+1,i); // ���⼭ start +1 �� �ƴ� �ش� ���� i �־������!! 
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


//����  ���� https://yabmoons.tistory.com/99
/*
�̹� ���ĺ� ������ ������ �ְ� �̱⸸ �ϸ� �Ǵ� ������ �빮��
 
*/

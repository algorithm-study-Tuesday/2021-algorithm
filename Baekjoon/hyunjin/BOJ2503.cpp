#include <bits/stdc++.h>
using namespace std;
int N;
struct numbaseball{
	int num, strike,ball;
};
vector<numbaseball> v;
vector<int> candi;
void Input(){
	cin >> N;
	for(int i = 0,a,b,c ; i < N; i++){
		cin>>a>>b>>c;
		v.push_back({a,b,c});
	}
}

bool CheckNumBaseball(int target, int num, int strike,int ball){
	int s=0,b=0;
	int t[3] = {target/100,(target%100)/10,  target%10};
	int n[3] = {num/100, (num%100)/10,  num%10};
	//첫번째 자리 
	for(int i=0 ; i < 3 ;i++ ){
		if(t[i]==n[i]) s++;
		else{
			if(t[i] == n[(i+1)%3] || t[i] == n[(i+2)%3] ) b++;
		}
	}
	if (s == strike && b == ball) return true;
	return false;
}

void Solution(){
	//숫자 후보 생성  
	for(int i =1; i <= 9 ; i++){
		for(int j=1; j<=9 && j != i ; j++){
			for(int k=1; k<=9 && k != i && k != j; k++){
				candi.push_back(i*100 + j*10+k);
			}
		}
	}
	
	for(int i= 0; i < N ; i++){
		for(int i =0 ; i < candi.size();i++){
			if(!CheckNumBaseball(candi[i],v[i].num,v[i].strike,v[i].ball )){
				candi.erase(candi.begin()+i);
				i--;
			}
			
		}
	}
	cout<<candi.size();

	
}

void Solve(){
	Input();
	Solution();

}
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);	
	Solve();	
}

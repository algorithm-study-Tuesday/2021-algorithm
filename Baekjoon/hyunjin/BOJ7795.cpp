//���� ���ΰ� ���� ���ΰ� 
#include <bits/stdc++.h>
#define MAX 20000
using namespace std;
vector<int> va,vb;
int num_a,num_b;
void Input(){
	cin >> num_a>>num_b;
	for(int i = 0,tmp ; i <num_a ;i++){
		cin>>tmp;
		va.push_back(tmp);
	} 
	for(int i = 0,tmp ; i <num_b ;i++){
		cin>>tmp;
		vb.push_back(tmp);
	}
}

void Solution(){
	int answer = 0;
	sort(vb.begin(),vb.end());
	for(int e : va){
		answer+=(lower_bound(vb.begin(),vb.end() , e) - vb.begin());
				//n���� �̷���� ���� ���տ��� ���ϴ� �� k �̻��� ���� ó������ �����ϴ� ��ġ

	}
	cout<<answer<<"\n";
}

void Solve(){
	int t;
	cin>>t;
	while(t--){
		va.clear(); vb.clear();
		Input();
		Solution();	
	}
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
	
}

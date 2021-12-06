#include <bits/stdc++.h>
using namespace std;
int graph[1025][1025]={0,};
int MatrixPrefixSum(int xs,int ys, int xe,int ye){
	int sum = 0;
	for(int i = ys; i<=ye ;i++){
		sum += (graph[i][xe]-graph[i][xs-1]);//�տ� xs�� ���ԵǾ���ϴ� xs-1�� ����  
	}
	return sum;
}
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int n,t;
	cin>>n>>t;
	for(int i = 1,sum,tmp ; i <= n ; i++){
		sum = 0;
		for(int j = 1 ; j <= n ; j++){
			cin>>tmp;
			sum+=tmp;
			graph[i][j] = sum; //�� �ະ ������ 
		}
	}
	string ans;
	while(t--){
		int xs,xe,ys,ye;
		cin>>ys>>xs>>ye>>xe; 
		ans += to_string(MatrixPrefixSum(xs,ys,xe,ye))+"\n";
	}
	cout<<ans;		
}

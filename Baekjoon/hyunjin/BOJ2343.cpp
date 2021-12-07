#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int n,m;//���� ��,��緹�� ��  
	cin>>n>>m;
	vector<ll> classes(n);
	for(int i = 0,tmp ; i < n;)	cin>>classes[i++];
	
	ll l=*max_element(classes.begin(),classes.end());
	ll u= 987654321;

	while(l<=u){
		int mid = (l+u)/2;
		
		ll cnt=0,sum = 0;//��緹�� ���� , ������ 
		for(int e : classes){
			if(sum + e > mid){ //��緹�� ���� �ʰ��ϸ� �� ��緹�̷�  
				sum = 0;
				cnt++;
			}
			sum += e;
		}
		if(sum) cnt++;//������ ���� ��緹�� ������ ���� �߰�  
		
		if(cnt > m){		
			l = mid+1;
		}
		else{//cnt < m
			u = mid-1;
		}
	}	

	cout<<l;
}

//BOJ 17503 �������� �켱���� ť Ǯ��  
#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
vector<pair<int,int>> beers;//����,��ȣ��  
ll n,m,k;
ll v,c;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	cin >>n>>m>>k;
	for(int i = 0 ; i < k; i++){
		cin >>v>>c;
		beers.push_back({c,v});
	}
	sort(beers.begin(),beers.end());//���� ���� ��������  ����  
	
	priority_queue<int> pq;
	ll m_sum = 0;
	for(int i = 0 ; i < k ; i++){
		pq.push(-beers[i].second);//�켱���� ���� �ٿ��� ���� ū������ ��������
		m_sum += beers[i].second;
		if(pq.size() > n){
			m_sum+= pq.top();//���� ���� ���� ������ ��ȣ�� �� ���� ���� ��ȣ�� ����  
			pq.pop();
		}
		
		if(pq.size() == n && m_sum >= m){ 
			cout<<beers[i].first;
			return 0;
		}
		
	}
	
	cout<<"-1";
	 

}
/*
Ǯ������
https://velog.io/@rachell_lee/BOJ17503-%EB%A7%A5%EC%A3%BC-%EC%B6%95%EC%A0%9C 
�켱���� ť ����
https://twpower.github.io/93-how-to-use-priority_queue-in-cpp
https://jungeu1509.github.io/algorithm/use-priorityqueue/ 
ť,�켱���� ť �м�
https://kibbomi.tistory.com/149 
*/

//BOJ 17503 맥주축제 우선순위 큐 풀이  
#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
vector<pair<int,int>> beers;//도수,선호도  
ll n,m,k;
ll v,c;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	cin >>n>>m>>k;
	for(int i = 0 ; i < k; i++){
		cin >>v>>c;
		beers.push_back({c,v});
	}
	sort(beers.begin(),beers.end());//도수 기준 오름차순  정렬  
	
	priority_queue<int> pq;
	ll m_sum = 0;
	for(int i = 0 ; i < k ; i++){
		pq.push(-beers[i].second);//우선순위 음수 붙여서 절댓값 큰수부터 나오도록
		m_sum += beers[i].second;
		if(pq.size() > n){
			m_sum+= pq.top();//기준 도수 이하 도수의 선호도 중 가장 낮은 선호도 제거  
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
풀이참고
https://velog.io/@rachell_lee/BOJ17503-%EB%A7%A5%EC%A3%BC-%EC%B6%95%EC%A0%9C 
우선순위 큐 사용법
https://twpower.github.io/93-how-to-use-priority_queue-in-cpp
https://jungeu1509.github.io/algorithm/use-priorityqueue/ 
큐,우선순위 큐 분석
https://kibbomi.tistory.com/149 
*/

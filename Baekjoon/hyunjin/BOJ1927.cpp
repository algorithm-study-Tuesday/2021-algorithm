#include <iostream>
#include <string>
#include <queue> 
using namespace std;
typedef long long ll;

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int n;
	cin>>n;
	priority_queue<ll,vector<ll>,greater<ll>> pq;
	while(n--){
		ll calc; 
		cin>>calc;
		if(calc){
			pq.push(calc);
		}
		else{
			if(!pq.size()) cout<<"0\n";
			else {
				cout<<pq.top()<<"\n";
				pq.pop();
					
			}
		}
	}
}

// multiset »ç¿ë¹ý  
#include <iostream>
#include <string>
#include <set> 
using namespace std;
typedef long long ll;

void Solve(){
	int testCase;
	cin>>testCase;
	while(testCase--){
		int k;cin>>k;
		multiset<ll> ms;
		
		for(int i = 0 ; i < k ;i++){

			char c; ll num;
			cin>>c>>num;

			switch(c){
				case 'I':{
					ms.insert(num);
					break;
				}
				case 'D':{
					if(!ms.size()) break;
					if(num==1){
						ms.erase(--ms.end());
					}
					else{
						
						ms.erase(ms.begin()); 
					}		
					break;
				}	
			}
		}
		
		if( ms.size()) cout<<  *(--ms.end() )<<" " << *ms.begin()<<"\n";
		else cout<<"EMPTY\n";
		
	}
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);

	Solve();

}

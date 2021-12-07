#include <iostream>
using namespace std;
typedef long long ll;


int main(){
	int T,N;
	scanf("%d",&T);
	while(T--){
		scanf("%d",&N);
		int stockPrice[N]={0,};		
		for(int i = 0 ; i < N; i++){ 
			scanf("%d",&stockPrice[i]); 
		}
		
		int maxPrice = 0;
		ll answer = 0 ;
		for(int i = N-1; i >=0 ;i--){
			maxPrice = (maxPrice < stockPrice[i]) ? stockPrice[i] : maxPrice;
			answer += (maxPrice - stockPrice[i]);
		}		
		printf("%lld\n",answer);
	}
	
}

#include <iostream>

using namespace std;
typedef long long lint;

int main(){
	lint N;
	scanf("%lld",&N);
	while(N){
		if(N%3 <=1 ){
			printf("NO\n");
			return 0;	
		}
		N/=3; 
	}
	printf("YES\n");
	return 0;
}

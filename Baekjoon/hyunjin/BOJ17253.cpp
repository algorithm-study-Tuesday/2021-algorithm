#include <iostream>

using namespace std;
typedef long long lint;

lint N;

void Input(){
	scanf("%lld",&N);
}


void Solution(){
	int i=0;
	lint tmp=1;
	while(N>tmp){
		tmp*=3;
		i++;
	}
	
	
	while(N>0){
		if(i<0){
			printf("NO\n");
			return;
		}
		
		if(N-tmp>=0){
			N-=tmp;
		}
		tmp/=3;
		i--;
		
	}
	printf("YES\n");
}

void Slove(){
	Input();
	Solution();	
}

int main(){

	
	Slove();
	
	return 0;
}

//±ò½ÓÇÏ°Ô ÇÏ´Â ¹æ¹ý ¾ø³ª?
 

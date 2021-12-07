#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
	int n,m;
	cin>>n>>m;
	int times[n];
	for(int i = 0 ; i < n ;i++) cin>>times[i];
	ll l= 1LL ,u = 1000000000001LL;//*max_element(times,times+n) * m;
	ll answer = u; //전체 시간  
	while(l<=u){
		ll mid = (l+u)/2;
		ll cnt = 0; //mid 시간내 만들 수 있는 풍선 수 
		for(auto e: times)
			cnt += (mid/e);
				
		if(cnt>=m){
			answer = answer < mid ? answer : mid;
			u = mid-1;
		}
		else l = mid+1;
		
	}
	cout<<answer;	
}
/*
https://www.it-gundan.com/ko/c%2B%2B/c-%EB%B0%8F-c-%EC%97%90%EC%84%9C-1ll-%EB%98%90%EB%8A%94-2ll%EC%9D%80-%EB%AC%B4%EC%97%87%EC%9E%85%EB%8B%88%EA%B9%8C/1071881361/
LL : long long 유형의 정수 리터럴 만든다.
1만 사용하면  (int를 32 비트로 가정하면 정수 유형의 크기를 넘어서서 정의되지 않은 동작으로 넘어갑니다). 1LL를 사용하면 미리 유형을 long long로 설정하면 2 ^ 40을 올바르게 반환합니다.
*/

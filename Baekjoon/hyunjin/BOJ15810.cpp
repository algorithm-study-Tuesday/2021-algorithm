#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
	int n,m;
	cin>>n>>m;
	int times[n];
	for(int i = 0 ; i < n ;i++) cin>>times[i];
	ll l= 1LL ,u = 1000000000001LL;//*max_element(times,times+n) * m;
	ll answer = u; //��ü �ð�  
	while(l<=u){
		ll mid = (l+u)/2;
		ll cnt = 0; //mid �ð��� ���� �� �ִ� ǳ�� �� 
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
LL : long long ������ ���� ���ͷ� �����.
1�� ����ϸ�  (int�� 32 ��Ʈ�� �����ϸ� ���� ������ ũ�⸦ �Ѿ�� ���ǵ��� ���� �������� �Ѿ�ϴ�). 1LL�� ����ϸ� �̸� ������ long long�� �����ϸ� 2 ^ 40�� �ùٸ��� ��ȯ�մϴ�.
*/

#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
ll N;
string moo = "moo";

void Input(){
	cin >> N;

}
  
void Solution(ll n1, ll k , ll len){ //n1카운트는 1부터시작  
	/* parameter
	  n1 : 찾으려는 위치
	  len : k-1의 길이 
	*/
	
	if(n1 <= 3){
		cout<<moo[n1-1];
		return;
	}
	
	ll klen = len*2+ k+3;//k번째 길이  
	if( klen >= n1){
		
		//가운데 k+1 moo인 경우  
		if( len < n1 && n1 <= len+k+3 ) {
			cout<<moo[n1-len-1]; 
			return;
		}
	
		
		//왼쪽 k-1의 moo 인 경우
		//오른쪽   k-1의 moo 인 경우
		//Solution(n1-(k+3)-len, k-1,len); 바로 전단계로 하지말고
		//아예 n1위치 수정 후 처음부터 돈다.
		Solution(n1-(len+ k+3),1,3); //다시 k=1로  
		
		
	}
	else{
		Solution(n1, k+1, klen);
	}


}

void Solve(){
	Input();
	Solution(N,1,3);
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
}
/*
풀이 참고 
https://velog.io/@xx0hn/BOJ-C-5904%EB%B2%88-Moo-%EA%B2%8C%EC%9E%84 


//메모리초과 풀이 
void Solution(){
	int k = 1;
	moostr = "moo";
	while(moostr.length() <= N){
		string tmp = moostr + "m";
		
		for(int i = 0; i < k+2; i++){
			tmp += "o";
		}
		
		
		moostr = tmp  + moostr;
		k++;
	}
	cout<<moostr[N-1]<<endl;
}
*/

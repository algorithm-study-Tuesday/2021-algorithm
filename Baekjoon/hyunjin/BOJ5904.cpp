#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
ll N;
string moo = "moo";

void Input(){
	cin >> N;

}
  
void Solution(ll n1, ll k , ll len){ //n1ī��Ʈ�� 1���ͽ���  
	/* parameter
	  n1 : ã������ ��ġ
	  len : k-1�� ���� 
	*/
	
	if(n1 <= 3){
		cout<<moo[n1-1];
		return;
	}
	
	ll klen = len*2+ k+3;//k��° ����  
	if( klen >= n1){
		
		//��� k+1 moo�� ���  
		if( len < n1 && n1 <= len+k+3 ) {
			cout<<moo[n1-len-1]; 
			return;
		}
	
		
		//���� k-1�� moo �� ���
		//������   k-1�� moo �� ���
		//Solution(n1-(k+3)-len, k-1,len); �ٷ� ���ܰ�� ��������
		//�ƿ� n1��ġ ���� �� ó������ ����.
		Solution(n1-(len+ k+3),1,3); //�ٽ� k=1��  
		
		
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
Ǯ�� ���� 
https://velog.io/@xx0hn/BOJ-C-5904%EB%B2%88-Moo-%EA%B2%8C%EC%9E%84 


//�޸��ʰ� Ǯ�� 
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

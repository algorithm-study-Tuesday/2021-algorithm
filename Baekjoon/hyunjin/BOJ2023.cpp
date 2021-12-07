#include <bits/stdc++.h>
using namespace std;

int N;
int one_digit_prime_nums[4] = {2,3,5,7};

void Input(){
	cin>> N;
}

bool IsPrimeNum(int num){
	if(num < 2) return false;
	for(int i = 2 ; i <= sqrt(num); i++){
		if(num % i == 0) return false;
	}
	return true;
}

void DFS(int num, int count){
	if(count == 0){
		cout<<num<<"\n";
		return ;
	}
	for(int i =1; i<10 ; i+=2){
		int tmp = num*10+i;
		if( IsPrimeNum(tmp) ) DFS(tmp, count-1);
	}
	
}


void Solution(){
	for(int i = 0 ; i < 4; i++){
		DFS(one_digit_prime_nums[i], N-1);
	}	
}

void Slove(){
	Input();
	Solution();
	
}


int main(){
	ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
	
	//freopen("Input.txt","r",stdin);	
	Slove();
	
	return 0;
}

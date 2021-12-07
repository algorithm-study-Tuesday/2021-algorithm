#include <bits/stdc++.h>
using namespace std;

bool prev_permutation(vector<int> &num, int n){
	int i = n-1;
	while(i>0 and num[i-1] < num[i]) i--; // 1. A[i-1] > A[i]를 만족하는 가장 큰 i를 찾는다.
	if(i<=0) return false;
	
	int j = n-1;
	while(num[i-1] <= num[j] ){ // 2. j≥i이면서 A[i-1] < A[j] 를 만족하는 가장 큰 j를 찾는다.
		j--;
	}
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int n;
    cin >> n;
    vector<int> a(n);
    for (int i=0; i<n; i++) cin >> a[i];
			
}

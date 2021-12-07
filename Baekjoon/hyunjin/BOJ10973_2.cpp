// https://velog.io/@polynomeer/%EC%88%9C%EC%97%B4Permutation
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    int a[n];
    for (int i=0; i<n; i++) cin >> a[i];
    if (  prev_permutation(a,a+n)   ) {
        for (int i=0; i<n; i++) 
        	cout << a[i] << ' ';
    } else {
        cout << "-1";
    }
    cout << '\n';
    return 0;
}

#include <iostream>
#include <vector>
using namespace std;

bool next_permutation(vector<int> &a, int n) {
    int i = n-1;
    while (i > 0 && a[i-1] >= a[i]) i -= 1; // 1. 뒤에서 부터 감소 순열의 끝부분 찾기 
    if (i <= 0) return false; // 감소 순열의 끝 위치가 0이면 맨마지막 순열이므로
    
    int j = n-1; //2. j>= i 이며 A[i-1]<A[j] 만족하는 가장 큰 j 
    
    while (a[j] <= a[i-1]) j -= 1;
    swap(a[i-1], a[j]); // 3. A[i-1]과 A[j]를 swap한다. 
    j = n-1; // 4. A[i]부터 순열을 뒤집는다.
    while (i < j) {
        swap(a[i], a[j]);
        i += 1; j -= 1;
    }
    return true;
}

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i=0; i<n; i++) cin >> a[i];
    if (next_permutation(a,n)) { // 다음 순열이 있다면 출력
        for (int i=0; i<n; i++) cout << a[i] << ' ';
    } else { // 다음 순열이 없다면 -1 출력
        cout << "-1";
    }
    //라이브러리 사용 파트 #include <algorithm> 
//    if (next_permutation(a.begin(),a.end())) {
//        for (int i=0; i<n; i++) cout << a[i] << ' ';
//    } else {
//        cout << "-1";
//    }
    
    return 0;
}

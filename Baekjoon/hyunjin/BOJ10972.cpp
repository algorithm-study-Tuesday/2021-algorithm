#include <iostream>
#include <vector>
using namespace std;

bool next_permutation(vector<int> &a, int n) {
    int i = n-1;
    while (i > 0 && a[i-1] >= a[i]) i -= 1; // 1. �ڿ��� ���� ���� ������ ���κ� ã�� 
    if (i <= 0) return false; // ���� ������ �� ��ġ�� 0�̸� �Ǹ����� �����̹Ƿ�
    
    int j = n-1; //2. j>= i �̸� A[i-1]<A[j] �����ϴ� ���� ū j 
    
    while (a[j] <= a[i-1]) j -= 1;
    swap(a[i-1], a[j]); // 3. A[i-1]�� A[j]�� swap�Ѵ�. 
    j = n-1; // 4. A[i]���� ������ �����´�.
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
    if (next_permutation(a,n)) { // ���� ������ �ִٸ� ���
        for (int i=0; i<n; i++) cout << a[i] << ' ';
    } else { // ���� ������ ���ٸ� -1 ���
        cout << "-1";
    }
    //���̺귯�� ��� ��Ʈ #include <algorithm> 
//    if (next_permutation(a.begin(),a.end())) {
//        for (int i=0; i<n; i++) cout << a[i] << ' ';
//    } else {
//        cout << "-1";
//    }
    
    return 0;
}

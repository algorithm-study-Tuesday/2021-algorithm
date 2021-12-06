#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
int L, C;
char arr[30];
int isused[30];
vector<char> v(30);
int ch[30];
void func(int depth, int start){
    if(depth == L){
        /* 최소 모음1개, 자음2개 검사 로직 */
        bool flagA=false, flagB=false;
        int cnt=0;
        for(int i=0;i<L;i++)
            if(arr[i]=='a' or arr[i]=='e' or arr[i]=='i' or arr[i]=='o' or arr[i]=='u'){
                flagA = true;
            }else{
                cnt++;
                if(cnt >= 2) flagB = true;
            }
        /* 모음,자음 조건이 만족하면 출력 */
        if(flagA and flagB)
        {
            for(int i=0;i<L;i++)
                cout << arr[i];
            cout << '\n';
        }
    }else
    {
        for(int i=start;i<C;i++)
        {
            if(isused[i]) continue;
            isused[i] = true;
            arr[depth] = v[i];
            func(depth+1, i+1);
            isused[i] = false;
        }
    }
}
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> L >> C;
    for(int i=0;i<C;i++)
        cin >> v[i];
    /* 알파벳을 사전순으로 정렬 */
    sort(v.begin(), v.begin()+C);
    func(0, 0);
    return 0;
}

//BOJ 17503 맥주축제 이분탐색  
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
 
int n, m, k;
vector<pair<ll, ll>> beers;
 
 bool cmp(pair<ll, ll>a, pair<ll, ll>b){
	return a.second < b.second;// 술 도수 레벨 기준 오름차순 정렬
 } 
 
int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
 
    cin >> n >> m >> k;
 
    int c_max = 0; // 도수 레벨 중 최대 값
    for (int i = 0; i < k; i++)
    {
        int v, c;
        cin >> v >> c;
        beers.push_back({v, c}); // 선호도, 도수 레벨
        c_max = max(c_max, c);   // 탐색 범위의 maximum 값
    }
 
    sort(beers.begin(), beers.end(), cmp); // 술 도수 레벨 기준 오름차순 정렬
 
    ll ans = 1e13;
    ll l = 1, u = c_max; // 탐새 범위 초기화
    while (l <= u)
    {
        ll mid = (l+u) / 2;
 
        ll total = 0;
        vector<ll> candis;
        for (auto beer : beers)
        {
            if (beer.second > mid) // 오름차순 정렬이므로 더이상 탐색 필요 x
                break;
 
            candis.push_back(beer.first);
        }
 
        if (candis.size() < n) // 마실 수 있는 맥주가 n개 조차 안되는 상황
        {
            l = mid + 1; // 도수 레벨을 조금 더 증가시키는 방향으로
            continue;           // 탐색 이어나가기
        }
 
        sort(candis.begin(), candis.end(),less<int>()); // 도수 레벨 mid 보다 낮은 도수 레벨의 술을 선호도 기준 내림차순 정렬
 
        for (int i = 0; i < n; i++)
            total += candis[i]; // 상위 n개의 선호도 합 계산
 
        if (total < m)          // 상위 n개의 선호도가 m보다 작다면
            l = mid + 1; // 도수 레벨을 조금 더 증가시키는 방향으로 탐색 이어나가기
        else
        {
            u = mid - 1; // 도수 레벨을 조금 더 감소시키는 방향으로 탐색 이어나가기
            ans = min(ans, mid); // 최소 도수 레벨(정답) 갱신
        }
    }
 
    cout << (ans != 1e13 ? ans : -1) << endl;
 
    return 0;
}


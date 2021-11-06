//BOJ 17503 �������� �̺�Ž��  
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
 
int n, m, k;
vector<pair<ll, ll>> beers;
 
 bool cmp(pair<ll, ll>a, pair<ll, ll>b){
	return a.second < b.second;// �� ���� ���� ���� �������� ����
 } 
 
int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
 
    cin >> n >> m >> k;
 
    int c_max = 0; // ���� ���� �� �ִ� ��
    for (int i = 0; i < k; i++)
    {
        int v, c;
        cin >> v >> c;
        beers.push_back({v, c}); // ��ȣ��, ���� ����
        c_max = max(c_max, c);   // Ž�� ������ maximum ��
    }
 
    sort(beers.begin(), beers.end(), cmp); // �� ���� ���� ���� �������� ����
 
    ll ans = 1e13;
    ll l = 1, u = c_max; // Ž�� ���� �ʱ�ȭ
    while (l <= u)
    {
        ll mid = (l+u) / 2;
 
        ll total = 0;
        vector<ll> candis;
        for (auto beer : beers)
        {
            if (beer.second > mid) // �������� �����̹Ƿ� ���̻� Ž�� �ʿ� x
                break;
 
            candis.push_back(beer.first);
        }
 
        if (candis.size() < n) // ���� �� �ִ� ���ְ� n�� ���� �ȵǴ� ��Ȳ
        {
            l = mid + 1; // ���� ������ ���� �� ������Ű�� ��������
            continue;           // Ž�� �̾����
        }
 
        sort(candis.begin(), candis.end(),less<int>()); // ���� ���� mid ���� ���� ���� ������ ���� ��ȣ�� ���� �������� ����
 
        for (int i = 0; i < n; i++)
            total += candis[i]; // ���� n���� ��ȣ�� �� ���
 
        if (total < m)          // ���� n���� ��ȣ���� m���� �۴ٸ�
            l = mid + 1; // ���� ������ ���� �� ������Ű�� �������� Ž�� �̾����
        else
        {
            u = mid - 1; // ���� ������ ���� �� ���ҽ�Ű�� �������� Ž�� �̾����
            ans = min(ans, mid); // �ּ� ���� ����(����) ����
        }
    }
 
    cout << (ans != 1e13 ? ans : -1) << endl;
 
    return 0;
}


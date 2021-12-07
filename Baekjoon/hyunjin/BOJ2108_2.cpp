#include <bits/stdc++.h>
using namespace std;

int n, mid=0,rep=0,range=0;
double avg=0;

bool comp(pair<int,int> a , pair<int,int> b){
	if(a.second == b.second) a.first < b.first;
	return a.second>b.second;
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	unordered_map<int,int> _map; // 숫자, 빈도  
	cin>>n;
	
	int arr[n];
	for(int i = 0 ; i < n ;i++) {
		cin>>arr[i];
		avg += arr[i];
		_map[arr[i]]++;
	}
	
	sort(arr,arr+n);
	
	
	avg = round(avg / (double)n ) ;//소숫점 첫째자리에서 반올림  
	mid = arr[n/2];
	
	vector<pair<int,int>> v(_map.begin(),_map.end());//map에서 vector로 복사  
	sort(v.begin(),v.end(),comp);
	
	for(auto e:v){
		cout<<e.first<<" "<<e.second<<endl;
	}
	
	rep= (v[0].second==v[1].second) ? v[1].first : v[0].second;
	
	range = arr[n-1]-arr[0];
	
	cout<<avg<<"\n"<<mid<<"\n"<<rep<<"\n"<<range;
	
}
//#include <iostream>
//#include <unordered_map>
//#include <vector>
//#include <algorithm>
//#include <cmath>
//using namespace std;
//
//bool cmp(const pair<int, int>& a, const pair<int, int>& b){
//	if(a.second == b.second) return a.first < b.first;
//	return a.second > b.second;
//}
//
//int main(){
//	ios::sync_with_stdio(false);
//	cin.tie(NULL);
//	cout.tie(NULL);
//
//	int N, s=0;
//	cin >> N;
//    
//	unordered_map<int, int> _map;
//	vector<int> temp;
//    
//	for(int i=0;i<N;i++){
//		int a;
//		cin >> a;
//		temp.push_back(a);
//		s += a;
//		_map[a]++;
//	}
//	
//	sort(temp.begin(), temp.end());
//	
//	vector<pair<int, int>> v(_map.begin(), _map.end());
//	sort(v.begin(), v.end(), cmp);
//	
//	cout << round(double(s) / N) << '\n';
//	cout << temp[N/2] << '\n';
//	if(v[0].second == v[1].second) cout << v[1].first << '\n';
//	else cout << v[0].first << '\n';
//	cout << temp[N-1] - temp[0] << '\n';
//    
//    return 0;
//}

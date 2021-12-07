#include <bits/stdc++.h>
using namespace std;

struct node{
	int y,x,like_cnt,blank_num
};

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int n;
	int dx[]={0,0,1,-1},dy[]={1,-1,0,0};
	cin>>n;
	int seat[n+1][n+1]={0,};
	vector<int> like[n+1];

	for(int i = 1,current_num; i <=n ;i++){
		//현재수, 좋아하는 수 입력받기  
		cin >>current_num;
		int j = 0;
		string s,buf;
		getline(cin,s);
		stringstream ss(s);
		while(ss>>buf){	like[current_num][j++]=stoi(buf);}	
		
		
		//1번조건 좋아하는 번호 많은 곳  
		for(int i =1 ; i <= n ; i++){
			
			for(int j = 1 ; j <=n;j++){
				for(int k = 0 ; k<4 ; k++){
					if(i+)
				}
			}
		}  
		
		//2번 조건
		int mx,my;
		for(int i =1 ; i <= n ; i++){
			for(int j = 1 ; j <=n;j++){
				for(int k = 0 ; k<4 ; k++){
					if(i+dy[k]>0 and i+dy[k]<n and j+dx[k]>0 and j+dx[k] <=n){
						
					}
				}
			}
		} 
		 
			
	}

	
}

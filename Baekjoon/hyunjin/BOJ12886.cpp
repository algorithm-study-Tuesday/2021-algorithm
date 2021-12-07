#include <bits/stdc++.h>
using namespace std;
int ABC[3],sum=0;

bool visited[1000][1000];


void BFS(){
	queue<pair<int,int>> q;
	q.push({ABC[0],ABC[1]});
	visited[ABC[0]][ABC[1]] = true;
	
	while(!q.empty()){
		int x = q.front().first, y = q.front().second;
		q.pop();
		int z = sum-x-y;
		if(x==y && y==z){
			cout<<1;
			return;
		}
		
		int nx[] = {x,x,y}, ny[] = {y,z,z};
		for(int i = 0 ; i < 3 ; i++){
			int a = nx[i], b = ny[i];
			if(a < b)
				b-=a, a*=2;	
			else if (a > b)
				a-=b, b*=2;	
			else continue; //°°À¸¸é pass 
			
			int c = sum - a-b;
			int X =  min(min(a,b),c);
			int Y = max(max(a,b),c);
			
			if(!visited[X][Y]){
				q.push({X,Y});
				visited[X][Y]=true;
			}
			
		}
	}
	cout<<0;
}

void Slove(){
	if(sum%3!=0) { 
		cout<<"0";
		return;
	}
	else BFS();
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	cin >>ABC[0]>>ABC[1]>>ABC[2];
	for(int e :ABC) sum+=e;	
	Slove();
}

#include <stdio.h>
#define _CRT_SECURE_NO_WARNINGS
#define MAX 21
using namespace std;
int A=0,B=0,C=0;
int dp[MAX][MAX][MAX]={0,};

void Input(){
	scanf("%d %d %d",&A,&B,&C);
}

int W(int a,int b,int c){
	if(a<=0 or b<= 0 or c<= 0) return 1;
	if(a > 20 or b>20 or c>20) return 1048576; // W(20,20,20);
	if(dp[a][b][c]) return dp[a][b][c];
	
	if(a<b and b<c){
		dp[a][b][c] =  W(a,b,c-1)+W(a,b-1,c-1)-W(a,b-1,c);
		return dp[a][b][c];
	} 
	else dp[a][b][c] = W(a-1,b,c)+W(a-1,b-1,c)+W(a-1,b,c-1)-W(a-1,b-1,c-1);
	return dp[a][b][c];

}


void Solve(){
	while(1){
		Input();
		if(A==-1 and B==-1 and C==-1) break;
		printf("w(%d, %d, %d) = %d\n",A,B,C,W(A,B,C));
//		cout<<"w("<<A<<", "<<B<<", "<<C<<") = "<<W(A,B,C)<<"\n";	
	}
}

int main(){
	//ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
}

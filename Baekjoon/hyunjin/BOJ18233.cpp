#include <bits/stdc++.h>

using namespace std;
int N,P,E;
int ans[20]={0,};
vector<pair<int,int>> numOfDolls; 
bool findCombi = false;

void Input(){
	cin>>N>>P>>E;//ȸ����, ���� ��� , ���� ��
	int xi,yi;
	for(int i =0 ; i < N ; i++){
		cin>>xi>>yi;
		numOfDolls.push_back({xi,yi});
	} 
}

void Solution(int startPos, vector<int> vec){
	if(findCombi) return;
	
	if(vec.size() == P){
		//ã�� ������ min,max ���ϱ�  
		int min = 0 , max =0;
		for(int i = 0 ; i < P ; i++){
			min += numOfDolls[vec[i]].first;
			max += numOfDolls[vec[i]].second;
		}
		
		//�����ַ��� ���� ���� E�� min,max ���̶��  
		if(min <= E and E <= max){	
			//min ��ŭ �й�  
			for(int i = 0; i < vec.size(); i++){
				ans[vec[i]] = numOfDolls[vec[i]].first;	
			}
			
			int tmp = E - min; // ���� ���� ��  

			//���� �� �ٽ� ��й�  
			for(int i = 0 ; tmp > 0 and i <P ;i++){
				int cnt = numOfDolls[vec[i]].second- numOfDolls[vec[i]].first;
				ans[vec[i]] += (tmp < cnt ? tmp : cnt );
				tmp -= (tmp < cnt ? tmp : cnt);
			}
			
			findCombi = true;
			return;
		}
	}
	//����ã��  
	for(int i = startPos+1; i < N ;i++){
		//startPos : ���ܰ� ���� ��ġ�̹Ƿ� +1 �������. 
		vec.push_back(i);
		Solution(i ,vec);
		vec.pop_back();	
	}
		
}



void Solve(){
	Input();
	vector<int> vec;
	Solution(-1,vec);
//	for(int i = 0 ; i < N ;i++){
//		vector<int> vec;
//		vec.push_back(i);
//		Solution(i,vec);
//		vec.pop_back();
//	}
	
	if(findCombi)
		for(int i = 0 ; i < N ;i++) cout<<ans[i]<<" ";	
	else cout<<"-1"; 	
}

int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	Solve();
}

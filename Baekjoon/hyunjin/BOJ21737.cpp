//find https://sweetnew.tistory.com/85
#include <bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
	int op_num;
	cin >> op_num; // �ǹ̰� �ֳ�?  
	string s;
	cin >> s;
	
	if(s.find('C') == string::npos){
		cout<<"NO OUTPUT\n"; return 0;
	}
	
	int answer = 0; 
	for(int i = 0 , term=0; i < s.length();i++){
		char token = s[i];
	
		if(isdigit(token)){
		//	cout<<"@@term  "<<
			term = term*10 +(token -'0'); // atoi : string to int
			continue;
		}
		
		cout<<"  #token = "<<token<<" term : "<<term<<endl;
		if(token=='C') cout<<answer<<"\n";
		
		else if(token == 'S'){
			answer-=term;
			
		}
		else if(token == 'M'){
			answer*=term;
		}
		else if(token == 'U'){//������ ���� ó�����ٰ��� ����   
			answer/=term;
		}
		else if(token == 'P'){
			answer+=term;
		}
		term = 0;
		cout<<answer<<endl;
	}
	
	
}

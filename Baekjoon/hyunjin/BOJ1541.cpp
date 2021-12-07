#include <iostream>
#include <string>
using namespace std;

int main(){
	ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
	string input;
	cin >> input;
	
	string num;
	int result = 0;
	bool isMinus = false;

	for(int i = 0 ; i <= input.size(); i++){
		if( input[i]=='-'|| input[i]=='+'|| i == input.size()){ //맨마지막 
			if(isMinus){
				result -= stoi(num);
				num="";
			}
			else{
				result += stoi(num);
				num="";
			}
		}
		else{//숫자 
			num += input[i];
		}
		
		if (input[i]=='-'){
			isMinus=true;
		}

	}
	cout<<result;
}

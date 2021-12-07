#include <iostream>

using namespace std;

int main(){
	int price,change,answer=0;
	int kindOfChanges[6]={500,100,50,10,5,1};
	scanf("%d", &price);
	change = 1000 - price;
	int i = 0;
	while(change > 0){
		answer = answer + change / kindOfChanges[i];
		change %= kindOfChanges[i];
		i++;
	}
	printf("%d",answer);	
}

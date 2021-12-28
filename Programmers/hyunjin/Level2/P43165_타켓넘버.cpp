#include <string>
#include <vector>
#include <iostream>

using namespace std;

void DFS(vector<int> numbers,int target,int currentNum ,int level, int &ans){
    if(level == numbers.size()){
        if(currentNum == target) ans+=1;
        return;
    }
    DFS( numbers,target,currentNum+numbers[level], level+1,ans);
    DFS( numbers,target,currentNum-numbers[level], level+1,ans);

}

int solution(vector<int> numbers, int target) {
    int answer = 0;
    DFS(numbers,target,0,0,answer);
    return answer;
}

#include <string>
#include <vector>
#include <iostream>
#include <cstring>
#define MAX 5
using namespace std;
bool keepDistance = true;
bool visited[MAX][MAX];

void DFS(vector<string> place,int y, int x,int level){
    if(level>2) return;
    if(y < 0 or y >= MAX or x< 0 or x >= MAX) return;
    if(visited[y][x]) return;
    if(place[y][x]=='X') return;

    visited[y][x]=true;
    if(level!=0 and place[y][x]=='P'){//level 2 이하의 P

        keepDistance = false;
        return;
    }
    
    
    int dy[4] = {0,0,1,-1};
    int dx[4] = {1,-1,0,0};
    for(int i = 0 ; i < 4 ; i++){
        DFS(place,y+dy[i],x+dx[i],level+1);
    }
    
}

void Solution(vector<string> place){
    for(int i = 0 ; i < MAX; i++){
        for(int j = 0 ; j < MAX ; j++){
           
            if(place[i][j]=='P') DFS(place,i,j,0);
        }
    }
}

vector<int> solution(vector<vector<string>> places) {
    vector<int> answer;
    vector<string> place;
    
    for(int i = 0 ; i < MAX ; i++){
        keepDistance = true;
        memset(visited,false,sizeof(visited));
        Solution(places[i]);
        answer.push_back(keepDistance);
    }
    
    
    
    
    return answer;
}

#include <string>
#include <vector>
#include <map>
#include <algorithm>
using namespace std;
map<string,int> m;

bool cmp(pair<string,int> a,pair<string,int> b){ return a.second > b.second;}

void findAllCourse(string order,int targetSize, string currentStr, int startIndex){
    if(targetSize == currentStr.length()){
         m[currentStr]++;
    }
    
    for(int i = startIndex; i < order.length(); i++){
        findAllCourse(order,targetSize,currentStr+order[i], i+1);
    }
}

vector<string> solution(vector<string> orders, vector<int> course) {
    vector<string> answer;
    
    for(int course_cnt : course){
        m.clear();
        
        for(string order : orders){
            
            //CBA -> ABC 로 정렬 
            sort(order.begin(),order.end());
            
            if( course_cnt <= order.length()){
                findAllCourse(order,course_cnt,"",0);
            }
            
        }
        
        //map에서 vector로 옮기기
        vector<pair<string,int>> vec(m.begin(),m.end());
        sort(vec.begin(), vec.end(),cmp);
        
        if(!vec.empty()){
            int biggest = vec[0].second;
            if(biggest < 2) continue;
            for(auto e : vec){
                if(e.second == biggest) answer.push_back(e.first);
                else break;
            }
        }
        
        
        
    }
    sort(answer.begin(),answer.end());
    return answer;
}

//코드 참고1 https://algosu.tistory.com/97
//코드 참고2 https://hini7.tistory.com/166

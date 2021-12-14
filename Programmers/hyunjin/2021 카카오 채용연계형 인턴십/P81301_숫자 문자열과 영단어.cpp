#include <string>
#include <vector>
#include <map>
#include <cctype> //ischar
#include <iostream>
using namespace std;
map<string,int> map_word2num;
void Init(){
    map_word2num.insert({"zero",0});
    map_word2num.insert({"one",1});
    map_word2num.insert({"two",2});
    map_word2num.insert({"three",3});
    map_word2num.insert({"four",4});
    map_word2num.insert({"five",5});
    map_word2num.insert({"six",6});
    map_word2num.insert({"seven",7});
    map_word2num.insert({"eight",8});
    map_word2num.insert({"nine",9});
}
int solution(string s) {
    Init();
    int answer = 0;
    string word_num;
    for(auto c : s){
        if(isalpha(c)){
            word_num+=c;
            if(map_word2num.find(word_num)==map_word2num.end()) continue;
            answer = answer*10+map_word2num[word_num];
            word_num = "";
            
        }
        else{
            answer = answer*10 +c-'0';
        }
    }
    
    return answer;
}

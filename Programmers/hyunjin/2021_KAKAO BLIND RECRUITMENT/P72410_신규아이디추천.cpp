#include <iostream>
#include <string>
#include <vector>
#include <algorithm>


using namespace std;

string solution(string new_id) {
    string answer = new_id;
  
    //step1
    transform(answer.begin(), answer.end(), answer.begin(), ::tolower);

    //step2
    for(int i = 0 ; i < answer.length() ; i++){
        char c = answer[i];
        if(c == '-' || c=='_'||c=='.') continue;
        if(isdigit(c) || islower(c)) continue;
        answer.erase(answer.begin()+i);
        i--;
    }
  
    //step3
    while(answer.find("..") != std::string::npos)
        answer.replace(answer.find("..") ,2 , ".");

    //step4
    if(answer[0]=='.') answer.erase(answer.begin());
    if(answer[answer.length()-1]=='.') answer.erase(answer.end()-1);
    
    //step5 
    if(answer.length()==0) answer = "a";
    
    //step6
    if(answer.length()>=16) answer = answer.substr(0,15);
    if(answer[answer.length()-1]=='.') answer.erase(answer.end()-1);
    //step7
    while(answer.length()<3)answer+= answer[answer.length()-1];
    

    
    return answer;
}

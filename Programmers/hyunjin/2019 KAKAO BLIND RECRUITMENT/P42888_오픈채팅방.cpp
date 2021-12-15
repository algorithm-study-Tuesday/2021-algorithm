//풀이 참고  https://velog.io/@redgem92/C%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-Level-2-%EC%98%A4%ED%94%88%EC%B1%84%ED%8C%85%EB%B0%A9
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <map>

#include <sstream>

using namespace std;

namespace{
    vector<string> Split(string input, char delimiter){
        vector<string> ret;
        stringstream ss(input);
        string tmp;
        
        while(getline(ss,tmp,delimiter))
            ret.push_back(tmp);
        return ret;
    }
    
    enum ActionType{
        NONE = 0,
        ENTER,
        LEAVE,
        CHANGE,
    };
    
    void ParseRecord(string record, ActionType& actionType, string& uid, string& nickName){
        const vector<string>& parsed = Split(record,' ');
        
        if(parsed[0].compare("Enter")==0){
            actionType = ENTER;
            uid = parsed[1];
            nickName = parsed[2];
        }
        else if(parsed[0].compare("Leave")==0){
            actionType = LEAVE;
            uid = parsed[1];
        } 
        else if(parsed[0].compare("Change")==0){
            actionType = CHANGE;
            uid = parsed[1];
            nickName = parsed[2];
        } 
    }  
}

vector<string> solution(vector<string> records) {
    map<string,string> idMap;//uid,nickname
    vector<pair<string,ActionType>> inoutRecords;
    for(const string& record : records){
        ActionType actionType = NONE;
        string uid,nickName;
        ParseRecord(record,actionType,uid,nickName);
        if(actionType == NONE) continue;
        
        switch(actionType){
            case ENTER:{
                idMap[uid] = nickName;
                inoutRecords.push_back({uid,ENTER});
                break;
            }
            case LEAVE:{
                inoutRecords.push_back({uid,LEAVE});
                break;
            }
            case CHANGE:{
                idMap[uid] = nickName;
                break;
            }      
            
        }
        
    }
    
    vector<string> answer;
    for(auto record : inoutRecords){
        string res = idMap[record.first] + "님이 ";
        res += (record.second == ENTER)? "들어왔습니다." : "나갔습니다.";
        answer.push_back(res);
    }
    
    return answer;
}

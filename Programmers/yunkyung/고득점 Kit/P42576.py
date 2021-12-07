def solution(participant, completion):
    dic = {}
    for i in participant:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    
    for j in completion:
        if dic[j] == 1:
            del dic[j]
        else:
            dic[j] -= 1
    
    return list(dic.keys())[0]
def solution(record):
    answer = []
    userId = {}
    for i in record:
        if (i.split(' ')[0] == 'Enter') | (i.split(' ')[0] == 'Change'):
            userId[i.split(' ')[1]] = i.split(' ')[2]

    for i in record:
        if (i.split(' ')[0] == 'Enter'):
            answer.append(userId[i.split(' ')[1]]+"님이 들어왔습니다.")
        elif (i.split(' ')[0] == 'Leave'):
            answer.append(userId[i.split(' ')[1]]+"님이 나갔습니다.")
        else:
            pass
    return answer
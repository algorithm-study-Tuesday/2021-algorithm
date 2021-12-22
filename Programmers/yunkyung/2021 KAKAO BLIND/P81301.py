def solution(s):
    number = {'zero':'0', 'one':'1', 'two':'2', 'three':'3', 'four':'4', 'five':'5', 'six':'6', 'seven':'7', 'eight':'8', 'nine':'9'}
    temp = ''
    answer = ''
    
    for word in s:
        if word in '0123456789':
            answer += word
        else:
            temp += word
        
        if temp in number.keys():
            answer += number[temp]
            temp = ''
            
    return int(answer)
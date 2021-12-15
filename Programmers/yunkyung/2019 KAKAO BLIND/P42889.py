def solution(N, stages):
    failResult = {}
    length = len(stages)
    for i in range(1, N+1):
        if length != 0:
            element = stages.count(i)
            failResult[i] = element/length
            length -= element
        else:
            failResult[i] = 0
    return sorted(failResult, key=lambda x : failResult[x], reverse=True)
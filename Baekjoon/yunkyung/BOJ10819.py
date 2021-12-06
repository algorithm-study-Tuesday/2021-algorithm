import sys
from itertools import permutations
input = sys.stdin.readline

n = int(input())
data = list(map(int,input().split()))

array = list(permutations(data,n))
result = 0
for i in range(len(array)):
    ans = 0
    for j in range(1,len(array[i])):
        ans += abs(array[i][j-1] - array[i][j])
    result = max(ans,result)

print(result)
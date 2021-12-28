n = int(input())

arr = [list(map(int, input().split())) for _ in range(n)]
ans = [0 for _ in range(1002)]

for i in range(n):
  for j in range(n):
    if i == j:
      pass
    ans[i] = max(ans[i], arr[i][j] | arr[j][i])
  
for i in range(n):
  print(ans[i])
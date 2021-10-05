import sys
input = sys.stdin.readline
N = int(input())
road = [list(map(int, input().split())) for _ in range(N)]
dp = [[[0]*3 for _ in range(N)] for _ in range(N)]

dp[0][1][0] = 1

for i in range(1, N):
  if road[0][i] == 1:
    break
  else:
    dp[0][i][0] = 1

for j in range(1, N):
  for k in range(2, N):
    if not road[j][k]:
      dp[j][k][0] = dp[j][k-1][0] + dp[j][k-1][2]
    if not road[j][k]:
      dp[j][k][1] = dp[j-1][k][1] + dp[j-1][k][2]
    if not road[j][k-1] and not road[j-1][k] and not road[j][k]:
      dp[j][k][2] = dp[j-1][k-1][1] + dp[j-1][k-1][0] + dp[j-1][k-1][2]

print(sum(dp[-1][-1]))
n = int(input())
dp = [100001] * (n + 1)
dp[0] = 0
coin = [7, 5, 2, 1]

for i in range(1, n+1):
  for c in coin:
    if c <= i and dp[i-c] + 1 < dp[i]:
      dp[i] = dp[i-c] + 1

print(dp[-1])
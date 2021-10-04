import sys
input = sys.stdin.readline

N = int(input())

dp = [1 for i in range(10001)]

number = []

for i in range(N):
  number.append(int(input()))

for i in range(2, 10001):
  dp[i] += dp[i-2]

for i in range(3, 10001):
  dp[i] += dp[i-3]

for i in number:
  print(dp[i])
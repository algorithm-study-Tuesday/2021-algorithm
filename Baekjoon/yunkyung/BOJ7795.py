import sys

input = sys.stdin.readline
t = int(input())
result = []
for i in range(t):
  an, bn = map(int, input().split())
  a = list(map(int, input().split()))
  b = list(map(int, input().split()))

  a.sort(reverse=True)
  b.sort(reverse=True)

  count = 0
  for j in range(an):
    maxCount = 0
    for k in range(bn):
      if a[j] > b[k]:
        count = bn - maxCount + count
        break
      else:
        maxCount += 1

  result.append(count)

for n in range(t):
  print(result[n])
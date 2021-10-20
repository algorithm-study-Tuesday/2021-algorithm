import sys

input = sys.stdin.readline

def binary_search(target, data):
  left = 0
  right = len(data) - 1
  res = -1

  while left <= right:
    mid = (left + right) // 2
    if data[mid] < target:
      res = mid
      left = mid + 1
    else:
      right = mid - 1
  
  return res

t = int(input())
for i in range(t):
  an, bn = map(int, input().split())
  a = list(map(int, input().split()))
  b = list(map(int, input().split()))
  a.sort()
  b.sort()
  count = 0

  for j in a:
    count += binary_search(j, b) + 1

  print(count)
import sys
input = sys.stdin.readline;

N, M = map(int, input().split())
a = list(map(int, input().split()))

def isPossible(time):
  balloon = 0
  for i in a:
    balloon += time // i
  if balloon >= M:
    return True
  return False

left = 0
right = 1e12

while left <= right:
  mid = (left + right) // 2
  balloon = 0
  if isPossible(mid):
    right = mid - 1
    answer = mid
  else:
    left = mid + 1

print(int(answer)) 
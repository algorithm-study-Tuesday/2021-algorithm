n = int(input())

if n < 2:
  print(1)
else:
  x, y = 1, 1
  for i in range(n-1):
    x, y = x + y + 1, x
  print(x % 1000000007)


n, lim, kim = map(int, input().split())
result = 0

while lim != kim:
    lim -= lim//2
    kim -= kim//2
    result += 1

print(result)
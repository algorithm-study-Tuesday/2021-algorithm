import sys
input = sys.stdin.readline

dx = [0,1,0,-1]
dy = [-1,0,1,0]

def bfs(i, j):
  queue = [(i, j)]
  wolf = 0
  sheep = 0
  
  while queue:
    i, j = queue.pop()
    if yard[i][j] == 'v':
      wolf += 1
    if yard[i][j] == 'o':
      sheep += 1
    yard[i][j] = '#'
    
    for k in range(4):
      nx = dx[k] + i
      ny = dy[k] + j
      if 0 <= nx < R and 0 <= ny < C:
        if yard[nx][ny] != '#':
          queue.append((nx, ny))
  
  if sheep <= wolf:
    sheep = 0
  else:
    wolf = 0
  return sheep, wolf
  

R, C = map(int, input().split())
yard = [list(input()) for _ in range(R)]
total_sheep = 0
total_wolf = 0

for i in range(R):
  for j in range(C):
    if yard[i][j] == 'o' or yard[i][j] == 'v':
      sheep, wolf = bfs(i, j)
      total_sheep += sheep
      total_wolf += wolf

print(total_sheep, total_wolf)
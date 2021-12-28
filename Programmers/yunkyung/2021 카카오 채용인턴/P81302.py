from collections import deque

def bfs(p):
    start = []
    
    for i in range(5):
        for j in range(5):
            if p[i][j] == 'P':
                start.append([i, j])
    
    for k in start:
        queue = deque([k])
        visited = [[0]*5 for i in range(5)]
        distance = [[0]*5 for i in range(5)] 
        visited[k[0]][k[1]] = 1
        
        while queue:
            y, x = queue.popleft()
        
            dx = [-1, 1, 0, 0]  # 좌우
            dy = [0, 0, -1, 1]  # 상하

            for i in range(4):
                cx = x + dx[i]
                cy = y + dy[i]

                if 0<=cx<5 and 0<=cy<5 and visited[cy][cx] == 0:
                    
                    if p[cy][cx] == 'O':
                        queue.append([cy, cx])
                        visited[cy][cx] = 1
                        distance[cy][cx] = distance[y][x] + 1
                    
                    if p[cy][cx] == 'P' and distance[y][x] <= 1:
                        return 0
    return 1


def solution(places):
    answer = []
    
    for i in places:
        answer.append(bfs(i))
    
    return answer
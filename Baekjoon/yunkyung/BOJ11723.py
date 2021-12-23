import sys
input = sys.stdin.readline

S = set()

def add(x):
  S.add(x)

def check(x):
  if x in S:
    return 1
  return 0

def remove(x):
  S.discard(x)

def toggle(x):
  if x in S:
     S.discard(x)
  else:
     S.add(x)

def empty():
  S.clear()
  
def all():
  global S
  S = {i for i in range(1, 21)}

for _ in range(int(input())):
    command = input().split()
    if command[0] == 'add':
        add(int(command[1]))
    elif command[0] == 'remove':
        remove(int(command[1]))
    elif command[0] == 'check':
        print(check(int(command[1])))
    elif command[0] == 'toggle':
        toggle(int(command[1]))
    elif command[0] == 'all':
        all()
    else:
        empty()
from collections import deque

# Step 1: Get Maze Input
def get_maze_input():
    print("Enter the number of rows and columns:")
    rows = int(input("Rows: "))
    cols = int(input("Columns: "))
    print("Enter the maze row by row (use 'S' for start, 'E' for end, '0' for path, '#' for wall):")

    maze = []
    start = end = None

    for i in range(rows):
        row = list(input(f"Row {i+1}: "))
        if len(row) != cols:
            print("Row length mismatch! Please re-enter.")
            return None, None, None
        maze.append(row)
        for j, val in enumerate(row):
            if val == 'S':
                start = (i, j)
            elif val == 'E':
                end = (i, j)

    if not start or not end:
        print("Start or End position missing!")
        return None, None, None

    return maze, start, end


# Step 2: Solve Maze using BFS
def solve_maze(maze, start, end):
    rows, cols = len(maze), len(maze[0])
    visited = [[False]*cols for _ in range(rows)]
    parent = [[None]*cols for _ in range(rows)]
    queue = deque()

    directions = [(-1,0), (1,0), (0,-1), (0,1)]  # Up, Down, Left, Right

    queue.append(start)
    visited[start[0]][start[1]] = True

    while queue:
        x, y = queue.popleft()
        if (x, y) == end:
            break

        for dx, dy in directions:
            nx, ny = x+dx, y+dy
            if 0 <= nx < rows and 0 <= ny < cols and not visited[nx][ny]:
                if maze[nx][ny] in ('0', 'E'):
                    visited[nx][ny] = True
                    parent[nx][ny] = (x, y)
                    queue.append((nx, ny))

    # Step 3: Reconstruct the path
    if not visited[end[0]][end[1]]:
        return False, []

    path = []
    x, y = end
    while (x, y) != start:
        path.append((x, y))
        x, y = parent[x][y]
    path.append(start)
    path.reverse()

    return True, path


# Step 4: Print the Maze with Path
def print_maze_with_path(maze, path):
    maze_copy = [row[:] for row in maze]
    for x, y in path:
        if maze_copy[x][y] not in ('S', 'E'):
            maze_copy[x][y] = '*'

    print("\nSolved Maze:")
    for row in maze_copy:
        print(''.join(row))


# Step 5: Main Program
maze, start, end = get_maze_input()
if maze:
    solved, path = solve_maze(maze, start, end)
    if solved:
        print("Path Found!")
        print_maze_with_path(maze, path)
    else:
        print("No path found from start to end.")
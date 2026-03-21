package Module9;

public class MazePath {
    static void findPaths(int[][] maze, int i, int j, String path) {
        int n = maze.length;

        // Base case: reached destination
        if (i == n - 1 && j == n - 1) {
            System.out.println(path);
            return;
        }

        // Boundary & obstacle check
        if (i >= n || j >= n || maze[i][j] == 0) {
            return;
        }

        // Move Right
        findPaths(maze, i, j + 1, path + "R");

        // Move Down
        findPaths(maze, i + 1, j, path + "D");
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        findPaths(maze, 0, 0, "");
    }
}
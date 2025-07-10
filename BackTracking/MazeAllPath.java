package BackTracking;

import java.util.ArrayList;

public class MazeAllPath {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        System.out.println(allPaths("", maze, 0, 0, visited));

    }

    static ArrayList<String> allPaths(String p, boolean[][] maze, int r, int c, boolean[][] visited) {
        ArrayList<String> list = new ArrayList<>();

        // Base condition: reached the end
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(p);
            return list;
        }

        // Check boundaries and cell accessibility
        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length || !maze[r][c] || visited[r][c]) {
            return list;
        }

        // Mark current cell as visited
        visited[r][c] = true;

        // All 8 directions
        list.addAll(allPaths(p + "D", maze, r + 1, c, visited));        // Down
        list.addAll(allPaths(p + "U", maze, r - 1, c, visited));        // Up
        list.addAll(allPaths(p + "R", maze, r, c + 1, visited));        // Right
        list.addAll(allPaths(p + "L", maze, r, c - 1, visited));        // Left
        list.addAll(allPaths(p + "d", maze, r + 1, c + 1, visited));    // Diagonal Down-Right
        list.addAll(allPaths(p + "dl", maze, r + 1, c - 1, visited));   // Diagonal Down-Left
        list.addAll(allPaths(p + "ur", maze, r - 1, c + 1, visited));   // Diagonal Up-Right
        list.addAll(allPaths(p + "ul", maze, r - 1, c - 1, visited));   // Diagonal Up-Left

        // Unmark the cell after recursion (backtrack)
        visited[r][c] = false;

        return list;
    }
}


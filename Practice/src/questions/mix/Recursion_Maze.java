package mix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursion_Maze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] maze = {{0, 0, 1,0}, {1, 0, 1,0}, {0, 0, 0,0},{1,1,0,0}};

        int row = maze.length;
        int col = maze[0].length;

        List<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[row][col];

        findMaze(maze,0,0,"", paths, visited);
        paths.stream().forEach(System.out::println);


    }

    private static void findMaze(int[][] maze, int row, int col, String path, List<String> paths, boolean[][] visited) {

        int rows = maze.length;
        int cols = maze[0].length;

        if (row == rows - 1 && col == cols -1) {
            paths.add(path);
            return;

        }

        visited[row][col] = true;

        // Explore all four directions: Down, Right, Up, Left

        // Down
        if (row + 1 < rows && maze[row + 1][col] == 0 && !visited[row + 1][col]) {
            findMaze(maze, row + 1, col, path + "D", paths, visited);
        }

        // Right
        if (col + 1 < cols && maze[row][col + 1] == 0 && !visited[row][col + 1]) {
            findMaze(maze, row, col + 1, path + "R", paths, visited);
        }

        // Up
        if (row - 1 >= 0 && maze[row - 1][col] == 0 && !visited[row - 1][col]) {
            findMaze(maze, row - 1, col, path + "U", paths, visited);
        }

        // Left
        if (col - 1 >= 0 && maze[row][col - 1] == 0 && !visited[row][col - 1]) {
            findMaze(maze, row, col - 1, path + "L", paths, visited);
        }


        visited[row][col] = false;
    }

}

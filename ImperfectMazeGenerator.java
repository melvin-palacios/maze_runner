import java.util.Random;
public class ImperfectMazeGenerator {
    private int width;
    private int height;
    private Cell[][] maze;

    public ImperfectMazeGenerator(int width, int height){
        this.width = width;
        this.height = height;
        this.maze = new Cell[width][height];

    }
    public void generateSimpleMaze(){
        for (int i = 0; i < this.width; i++){
            for (int j = 0; j < this.height; j++){
                this.maze[i][j] = new Cell(i, j);
            }
        }
    }

    public void generateGraphMaze(){
        System.out.println("Maze 5");
    }

    public void generateOptimizedMaze(){
        System.out.println("Maze 6");
    }
}


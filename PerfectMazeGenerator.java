public class PerfectMazeGenerator {
    private int width;
    private int height;
    private Cell[][] maze;

    public PerfectMazeGenerator(int width, int height){
        this.width = width;
        this.height = height;
        this.maze = new Cell[width][height];
    }
    public void generateSimpleMaze(){
        System.out.println("Maze 4");
    }

    public void generateGraphMaze(){
        System.out.println("Maze 5");
    }

    public void generateOptimizedMaze(){
        System.out.println("Maze 6");
    }
}

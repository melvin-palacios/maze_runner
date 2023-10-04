public class Cell {
    public int x;
    public int y;
    public boolean visited;
    public boolean[] walls = {true, true, true, true};
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
        boolean visited = false;
        boolean[] walls = {true, true, true, true};
    }
}

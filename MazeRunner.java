public class MazeRunner {
    public static void main(String[] args) {
        if (args == null){
            System.out.println("Error: No arguments \n Here is the syntax : \n MazeRunner <width> <height> <perfect|imperfect> <simple|graph|optimized>");
            return;
        }
        if (args.length != 4){
            System.out.println("Error: Invalid number of arguments \n Here is the syntax : \n MazeRunner <width> <height> <perfect|imperfect> <simple|graph|optimized>");
            return;
        }
        try {
            Integer.parseInt(args[0]);
            Integer.parseInt(args[1]);
        } catch (NumberFormatException e){
            System.out.println("Error: the first two arguments must be integers");
            return;
        }
        if (Integer.parseInt(args[0]) < 5 || Integer.parseInt(args[1]) < 5){
            System.out.println("Error: the width and height must be greater than 5");
            return;
        }

        switch (args[2]){
            case "perfect":
                PerfectMazeGenerator perfect_generator = new PerfectMazeGenerator(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                switch (args[3]){
                    case "simple":
                        perfect_generator.generateSimpleMaze();
                        break;
                    case "graph":
                        perfect_generator.generateGraphMaze();
                        break;
                    case "optimized":
                        perfect_generator.generateOptimizedMaze();
                        break;
                    default:
                        System.out.println("Error: Invalid argument for perfect maze");
                        break;
                }
                break;
            case "imperfect":
                ImperfectMazeGenerator imperfect_generator = new ImperfectMazeGenerator(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                switch (args[3]){
                    case "simple":
                        imperfect_generator.generateSimpleMaze();
                        break;
                    case "graph":
                        imperfect_generator.generateGraphMaze();
                        break;
                    case "optimized":
                        imperfect_generator.generateOptimizedMaze();
                        break;
                    default:
                        System.out.println("Error: Invalid argument for imperfect maze");
                        break;
                }
                break;
            default:
                System.out.println("Error: Invalid argument");
                break;
        }
    }
}

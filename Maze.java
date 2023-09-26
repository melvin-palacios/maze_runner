public class Maze {
    public static void main(String[] args) {
        if (args == null){
            System.out.println("Error: No arguments \n Here is the syntax : \n Maze <width> <height> <perfect|imperfect> <simple|graph|optimized>");
            return;
        }
        if (args.length != 4){
            System.out.println("Error: Invalid number of arguments \n Here is the syntax : \n Maze <width> <height> <perfect|imperfect> <simple|graph|optimized>");
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
                switch (args[3]){
                    case "simple":
                        System.out.println("Maze 1");
                        break;
                    case "graph":
                        System.out.println("Maze 2");
                        break;
                    case "optimized":
                        System.out.println("Maze 3");
                        break;
                    default:
                        System.out.println("Error: Invalid argument for perfect maze");
                        break;
                }
                break;
            case "imperfect":
                switch (args[3]){
                    case "simple":
                        System.out.println("Maze 4");
                        break;
                    case "graph":
                        System.out.println("Maze 5");
                        break;
                    case "optimized":
                        System.out.println("Maze 6");
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

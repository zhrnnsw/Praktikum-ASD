import java.util.Scanner;
public class PacManMain {
    public static void main(String[] args) {
        PacMan p = new PacMan(10, 10, 20, 20);
        Scanner zh = new Scanner(System.in);
        
        p.printPosition();
        System.out.println("a => move left");
        System.out.println("d => move right");
        System.out.println("w => move up");
        System.out.println("a => move down");
        System.out.println("x => exit");
       
        loop :while (true) {
            switch(zh.nextLine()){
                case "a":
                    p.moveLeft();
                    break;
                case "d":
                    p.moveRight();
                    break;
                case "w":
                    p.moveUp();
                    break;
                case "s" :
                    p.moveDown();
                    break;
                case "x":
                    break loop;
                default :
                    p.printPosition();
                    break;
                
            }
        }
    }
}


public class PacMan {
    int x, y, width, height; 
    PacMan(int x1, int y1, int w, int h){
        x = x1;
        y = y1;
        width = w;
        height = h;
    }

    void moveLeft(){
        if(x > 1) x--;
        printPosition();
    }

    void moveRight(){
        if(x < width) x++;
        printPosition();
    }

    void moveUp(){
        if(y < height) y++;
        printPosition();
    }

    void moveDown(){
        if(y > 1) y--;
        printPosition();
    }

    void printPosition(){
        System.out.println("Posisi (" + x + ","+y+")");
    }
}

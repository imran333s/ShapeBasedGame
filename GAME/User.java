package GAME;
import java.util.*;
public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        Game g1 = new Game();
        do{
            g1.selectShape();
            System.out.println("Pres Y/y for Continue");
            c=sc.next().charAt(0);
        } while(c=='Y' || c=='y');
        System.out.println("=== Program Ends!! ===");
        sc.close();

        
        
    }
}

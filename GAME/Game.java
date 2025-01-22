package GAME;
import java.util.*;

public class Game {
    Scanner sc = new Scanner(System.in);
   {
    System.out.println("=== Game has Started ===");
   }

    public  void selectShape() {
        System.out.println("Enter 1 ===> 2D Shape ");
        System.out.println("Enter 2 ===> 3D Shape");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("you have selected 2D shape");
            TwoDShape td = SelectTwoDShape();
            td.getDetails();
            td.getArea();
            td.getPerimeter();


        } else if (choice == 2) {
            System.out.println("you have selected 3D shape");
            ThreeDShape td3 = selectThreeDShape();
            td3.getDetails();
            td3.getVolume();
            td3.getLateralSurfaceArea();
            td3.getTotalSurfaceArea();
        } else {
            System.out.println("it is invalid choice!!");
             selectShape();
        }

    }

    public TwoDShape SelectTwoDShape(){
    System.out.println("enter 1 circle");
    System.out.println("enter 2 Triangle");
    System.out.println("enter 3 Square");
    int choice=sc.nextInt();

    if(choice ==1){
        System.out.println("You have selected circle!");
        System.out.println("Enter the Radius: ");
        double radius=sc.nextDouble();
        return new Circle(radius);
    }

    else if(choice==2){
        System.out.println("You have selected Triangle");
        System.out.println("Enter side1: ");
        double s1=sc.nextDouble();
        System.out.println("Enter side2: ");
        double s2=sc.nextDouble();
        System.out.println("Enter side3: ");
        double s3=sc.nextDouble();
        return new Triangle(s1, s2, s3);
    } else if(choice ==3)
    {
        System.out.println("You have selected Square");
        System.out.println("Enter side");
        double side=sc.nextDouble();
        return new Square(side);
    }
    
    else{
    System.out.println("Invalid choice Entered!");
    return SelectTwoDShape();
    }
}

    
public ThreeDShape selectThreeDShape()
{
    System.out.println("enter 1 Cylinder");
    System.out.println("enter 2 Cube");
    int choice=sc.nextInt();
    if(choice==1)
    {
        System.out.println("You have selected Cylinder");
        System.out.println("Enter the Radius: ");
        double r=sc.nextDouble();
        System.out.println("Enter the Height: ");
        double h=sc.nextDouble();
        return new Cylinder(r,h);
    }
     else if(choice==2)
     {
        System.out.println("You have selected Cube");
        System.out.println("Enter the edgeLength: ");
        double edgeLength=sc.nextDouble();
        return new Cube(edgeLength);
     }
     else{
        System.out.println("Invalid choice Entered!");
    return selectThreeDShape();
     }

}

}

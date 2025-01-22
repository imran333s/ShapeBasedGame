package GAME;

public class Square  implements TwoDShape{
    double side;

    Square(){}

    Square(double side)
    {
        if(isValid(side))
        {
            this.side=side;
        } else{
            System.out.println("Inavlid side Entered");
        }
    }

    public boolean isValid(double side)
    {
        return side >0;
    }

    @Override
    public void getDetails()
    {
        System.out.println("The side of Square is: "+ side+"  unit");
    }

    @Override
    public void getArea()
    {
        double area=side*side;
        System.out.println("The are of Square is: "+ area +" unit");
    }

    @Override
    public void getPerimeter()
    {
        double perimeter=4*side;
        System.out.println("The are of Square is: "+ perimeter +" unit");
    }
    
}

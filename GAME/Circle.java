package GAME;

public class Circle implements TwoDShape {
    double radius;
    Circle()
    {
        
    }

    Circle( double radius)
    {
        if(isValid(radius))
        this.radius=radius;
        else
        System.out.println("Invalid radius entered!");
    }

    private boolean isValid(double radius)
    {
        return radius>0;
    }

    @Override
    public void getDetails()
    {
        System.out.println("The Radius of Circle is: "+radius+ " Sq unit");
    }

    @Override
    public void getArea()
    {
        System.out.println("The Area of Circle is: "+Math.PI*radius*radius+ " Sq unit");
    }
    @Override
    public void getPerimeter()
    {
        System.out.println("The perimeter of circle is: "+2*Math.PI*radius+ " Sq unit");
    }

}

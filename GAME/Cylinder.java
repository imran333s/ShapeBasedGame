package GAME;

public class Cylinder implements ThreeDShape {
    double radius;
    double height;

    Cylinder() {
    }

    Cylinder(double radius, double height) {
        if (isValid(radius, height)) {
            this.radius = radius;
            this.height = height;
        } else
            System.out.println("Inavlid  radius and height Entered ");
    }

    private boolean isValid(double radius, double height) {
        return radius > 0 && height > 0;
    }

    @Override
    public void getDetails()
    {
        System.out.println("The radius of Cylinder is: "+radius+" and height of Cylinder is: "+ height);
    }

    @Override
    public void getVolume() {
        double Volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder is: " + Volume + " Cubic unit");
    }

    @Override
    public void getLateralSurfaceArea() {
        double lateralSurfaceArea=2 * Math.PI * radius * height ;
        System.out.println("LSA of Cylinder is: " + lateralSurfaceArea + " Sq unit");
    }

    @Override
    public void getTotalSurfaceArea() {
        double totalSurfaceArea= 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        System.out.println("TSA of Cylinder is: " + totalSurfaceArea + " Sq unit");
    }

}

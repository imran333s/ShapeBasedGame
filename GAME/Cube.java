package GAME;

public class Cube  implements ThreeDShape{
    double edgeLength;
    Cube(){}

    Cube(double edgeLength)
    {
        if(isValid(edgeLength))
        {
            this.edgeLength=edgeLength;
        } else
        System.out.println("Invalid edgeLenth Entered");
    }

    private boolean isValid(double edgeLength)
    {
        return edgeLength>0;
    }

    @Override
    public void getDetails()
    {
        System.out.println("The edgeLength of Cube is: "+ edgeLength);
    }


    @Override
    public void getVolume()
    {
        double volume =Math.pow(edgeLength, 3) ;
        System.out.println("Volume of Cube is: "+ volume+ " cubic units");
    }

    @Override
    public void getLateralSurfaceArea()
    {
        double lateralSurfaceArea = 4*Math.pow(edgeLength, 2);
        System.out.println("LSA of Cube is: "+ lateralSurfaceArea +" Square units");
    }

    @Override
    public void getTotalSurfaceArea()
    {
        double totalSurfaceArea=6*Math.pow(edgeLength, 2);
        System.out.println("TSA of Cube is: "+ totalSurfaceArea +" Square units");
    }


}

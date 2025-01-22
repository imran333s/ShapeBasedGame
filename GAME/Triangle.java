package GAME;

public class Triangle implements TwoDShape {
    double s1, s2, s3;

    Triangle() {
    }

    Triangle(double s1, double s2, double s3) {
        if (isValid(s1, s2, s3)) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        } else
            System.out.println("Invalid Sides of Triangle Entered");

    }

    private boolean isValid(double s1, double s2, double s3) {
        return s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2;
    }

    @Override
    public void getDetails() {
        System.out.println("The Three Side of Triangle is: " + s1 + ", " + s2 + " and " + s3);
    }

    @Override
    public void getArea() {
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("The Area of Triangle is: " + area + " Sq units");
    }

    @Override
    public void getPerimeter() {
        double perimeter = s1 + s2 + s3;
        System.out.println("The perimeter of Triangle is: " + perimeter + "  unit");
    }

}

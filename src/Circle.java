public class Circle{
    private static double radius = 1.0;
    private String color = "red";
    Circle(){};
    public Circle(double r){
        radius = r;
    }
    public  double getArea(){
        return radius * radius * Math.PI;
    }
    public double getRadius(){
        return radius;

    }

}

class TestCircle{
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        double area = circle.getArea();
        System.out.println("Area = " + area);
    }
}

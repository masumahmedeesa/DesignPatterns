import java.util.*;

interface Shape{
    double getValue();
}

class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double getValue(){
        return radius;
    }
}

class Square implements Shape{
    double side;
    Square(double side){
        this.side = side;
    }
    public double getValue(){
        return side;
    }
}

class CalculateAreaSummation{
    ArrayList<Shape>arr = new ArrayList<>();
    double total = 0;

    void addShape(Shape shape){
        arr.add(shape);
    }

    public double calcArea(){
        this.total = 0;
        for(Shape shape : arr){
            if(shape instanceof Circle) total += Math.PI*shape.getValue()*shape.getValue();
            if(shape instanceof Square) total += shape.getValue()*shape.getValue();
        }
        return total;
    }

    void printOutput(){
        System.out.println("total: " + total);
    }
}


class OpenClosed{
    public static void main(String[] args){
        Shape circle = new Circle(5);
        Shape square = new Square(10);

        CalculateAreaSummation sum = new CalculateAreaSummation();
        sum.addShape(circle);
        System.out.println(sum.calcArea());

        sum.addShape(square);
        System.out.println(sum.calcArea());
    }
}
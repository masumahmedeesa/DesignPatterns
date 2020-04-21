interface Shape{
    double getArea();
    double getVolume();
}

class Square implements Shape{
    double side;
    Square(double side){
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    public double getVolume(){
        // 2d shape square does not have a volume
        return 0;
    }
}

class Cube implements Shape{
    double side;
    Cube(double side){
        this.side = side;
    }

    public double getArea(){
        return 6*side*side;
    }

    public double getVolume(){
        return side*side*side;
    }
}

class InterfaceSegregation{
    public static void main(String[] args){
        Square sq = new Square(10);
        System.out.println(sq.getArea());

        Cube cb = new Cube(10);
        System.out.println(cb.getArea()+" "+cb.getVolume());
    }
}
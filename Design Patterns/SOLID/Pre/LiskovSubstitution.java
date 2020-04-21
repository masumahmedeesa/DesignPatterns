class Rectangle{
    int side1, side2;
    Rectangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    int getArea(){
        return side1*side2;
    }
}

class Square extends Rectangle{
    int side;
    Square(int side){
        super(side, side);
        this.side = side;
    }
}

class LiskovSubstitution{
    public static void main(String[] args){
        Rectangle rec = new Rectangle(5, 10);
        System.out.println(rec.getArea());

        Rectangle sqr = new Square(10);
        System.out.println(sqr.getArea());
    }
}
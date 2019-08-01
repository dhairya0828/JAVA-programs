abstract class Shape{
    abstract void area(float a,float b);
}

class Triangle extends Shape{
    void area(float base,float altitude){
        System.out.println("Area of Triangle is : " + 0.5*base*altitude);
    }
}

class Rectangle extends Shape{
    void area(float length,float breadth){
        System.out.println("Area of Rectangle is : " + length*breadth);
    }
}
class Circle extends Shape{
    void area(float radius,float radius2){
        System.out.println("Area of Circle is : " + 3.14*radius*radius2);
    }
}

class AreaOfShape{
    public static void main(String[] args) {
        Shape s = new Triangle();
        s.area(5f,4f);

        s = new Rectangle();
        s.area(4f,3f);

        s = new Circle();
        s.area(5,5);
    }
}

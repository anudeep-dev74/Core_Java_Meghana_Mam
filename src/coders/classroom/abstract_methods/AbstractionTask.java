package coders.classroom.abstract_methods;

import java.util.Scanner;

abstract class Shape{
    float area;
    abstract void input();
    abstract void cal_area();
    void display(){
        System.out.println("Area is " + area);
    }
}
class Rectangle extends Shape{
    int length, breadth;

    @Override
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length");
        length = input.nextInt();
        System.out.println("enter the breadth");
        breadth = input.nextInt();
    }

    @Override
    void cal_area() {
        area = length * breadth;
    }
}
class Square extends Shape {
    int side;
    @Override
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the side - ");
        side = input.nextInt();
    }

    @Override
    void cal_area() {
        area = side * side;
    }
}
class Circle extends Shape {
    float radius;
    @Override
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius - ");
        radius = input.nextFloat();
    }

    @Override
    void cal_area() {
        area = 3.14f * radius * radius;
    }
}
class AreaCalculation {
    void allowShape(Shape shape){
        shape.input();
        shape.cal_area();
        shape.display();
    }
}
public class AbstractionTask {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        /*r.input();
        r.cal_area();
        r.display();*/
        Square s = new Square();
        /*s.input();
        s.cal_area();
        s.display();*/
        Circle c = new Circle();
        /*c.input();
        c.cal_area();
        c.display();*/
        AreaCalculation ac = new AreaCalculation();
        ac.allowShape(r);
        ac.allowShape(s);
        ac.allowShape(c);
    }
}


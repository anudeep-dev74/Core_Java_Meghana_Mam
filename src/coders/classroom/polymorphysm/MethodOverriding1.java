package coders.classroom.polymorphysm;

class Parent1 {
    public void display(){
        System.out.println("Parent");
    }
}
class Child1 extends Parent{
    public void create(){
        System.out.println("Creating");
    }
}
public class MethodOverriding1 {
    static void main(String[] args) {
        Child1 c1 = null;
        c1.display();
    }
}

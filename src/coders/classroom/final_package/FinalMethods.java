package coders.classroom.final_package;
class Parent{
    final void display(){
        System.out.println("Parent class display Method");
    }
}

class Child extends Parent{

}
public class FinalMethods {
    static void main(String[] args) {
        Parent p = new Parent();
        p.display();
    }
}

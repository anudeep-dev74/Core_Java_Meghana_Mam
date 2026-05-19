package coders.classroom.abstract_methods;
abstract  class Main1 {
    abstract void display();
    void creating() {
        System.out.println("Concreate Methods");
    }
    /*
       static void writting();
        Error - Static methods should have the implementation or else it should
        the abstract method.
    */
}
class Main2 extends Main1{
    void display() {
        System.out.println("Implemented Abstract method");
    }
}
public class AbstractMethods1 {
    static void main(String[] args) {
       Main2  m2 = new Main2();
       m2.display();
       m2.creating();
    }
}

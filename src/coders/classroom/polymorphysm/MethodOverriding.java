package coders.classroom.polymorphysm;

class Parent{
    public void display(){
        System.out.println("Parent Class Properties");
    }
    /*public static void display(){
        System.out.println("Parent Class Properties");
    }*/
}

class Child extends Parent{
    //@Override
    public void display(){
        System.out.println("Child Class Properties");
    }

    /*public static void display(){
        System.out.println("Child Class Properties");
    }*/

    /*public void create(){
        System.out.println("Child Method creation");
    }*/
}

public class MethodOverriding {

    static void main(String[] args) {
        /*Child c = new Child();
        c.display();*/
        Parent p = new Child();
        p.display();
    }
}

package coders.classroom.polymorphysm;

public class MethodOverloading {

    /*static void add(byte a, byte b){
        System.out.println("Byte Values");
    }

    static void add(int a, int b){
        System.out.println("Integer Values");
    }

    static void add(float a, float b){
        System.out.println("Floating values");
    }

    static void add(double a, float b){
        System.out.println("Mixed values");
    }

    static void add(long a, long b){
        System.out.println("Long Values");
    }
    static void add(Integer a, Integer b){
        System.out.println(a);
        System.out.println(b);
        System.out.println("Wrapper Integer Values");
    }*/

    static void add(int... a){
        System.out.println(a);
        System.out.println("Variable Arguments");
    }

    static void main(String[] args) {
        /*double a = 10;
        float b = 20.0f;*/
        int a = 10;
        int b = 20;
        //add(a,b);
        add(a,b,30,40,50,60);
    }
}

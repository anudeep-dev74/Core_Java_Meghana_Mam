package coders.classroom.final_package;

public class FinalVariables {
    final int a;

    public FinalVariables(int a){
        this.a = a;
    }
    static void main(String[] args) {
       /* FinalKeywordExample fk = new FinalKeywordExample();
        System.out.println(fk.a);*/
        /*final int a;
        a = 20;
        a = 8;
        System.out.println(a);*/
        FinalVariables fk = new FinalVariables(10);
        System.out.println(fk.a);

    }
}

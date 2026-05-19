package coders.classroom.strings;

public class String1 {
    static void main(String[] args) {
       String s = "ABCDEF";
       char[] char_arr = s.toCharArray();
       for(char c: char_arr){
           System.out.println(c);
       }
    }
}

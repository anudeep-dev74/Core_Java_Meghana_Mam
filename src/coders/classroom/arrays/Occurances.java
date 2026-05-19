package coders.classroom.arrays;

public class Occurances {
    static void main(String[] args) {
        int[] arr = {10,40,20,30,40,50,40,60};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 40){
                count++;
            }
        }
        if(count < 0){
            System.out.println("Not Present");
        }
        System.out.println(count);
    }
}

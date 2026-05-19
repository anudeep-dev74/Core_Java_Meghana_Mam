package coders.classroom.arrays;

public class MissingNumber2 {
    static void main(String[] args) {
        int[] arr = {1,2,4,5,8,9,10};
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int p = 1;
        while(p < max){
            boolean isContains = false;
            for(int i = 0; i < arr.length; i++){
                isContains = true;
                break;
            }
            if(!isContains){
                System.out.println(p);
            }

        }
    }
}

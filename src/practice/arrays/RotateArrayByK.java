package practice.arrays;

public class RotateArrayByK {
    static void rotateByK(int[] arr, int k){
        k = k % arr.length;
        if(k < 0){

        }
    }
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        System.out.println("before rotation - ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("after rotation - ");

    }
}

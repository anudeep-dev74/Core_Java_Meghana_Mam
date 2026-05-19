package coders.assignments.arrays;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;
        boolean status = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                status = true;
                break;
            }
        }
        if(status){
            System.out.println("Element Found");
        }else {
            System.out.println("Element Not Found");
        }
    }
}

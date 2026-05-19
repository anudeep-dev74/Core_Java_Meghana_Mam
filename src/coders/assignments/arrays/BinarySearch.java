package coders.assignments.arrays;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {10,20, 30, 40, 50, 60, 70, 80, 90};
        int target = 80;
        int start = 0, end = arr.length-1;
        boolean status = false;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                status = true;
                break;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        if(status){
            System.out.println("Element Found");
        }else {
            System.out.println("Element Not Found");
        }
    }
}

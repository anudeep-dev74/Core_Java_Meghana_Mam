package coders.classroom.arrays;

public class MissingNumber {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9,10};
        int sum = 0, asum = 0;
        for(int i = 0; i <= 10; i++){
            sum += i;
        }
        for(int i = 0; i < arr.length; i++){
            asum += arr[i];
        }
        System.out.println("Missing Number - " + (sum - asum));
    }
}

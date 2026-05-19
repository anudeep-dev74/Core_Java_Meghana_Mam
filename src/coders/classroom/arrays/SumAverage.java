package coders.classroom.arrays;

public class SumAverage {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40,50,60};
        int sum = 0;
        for(int sum_ele: arr){
            sum += sum_ele;
        }
        System.out.println(sum);
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}

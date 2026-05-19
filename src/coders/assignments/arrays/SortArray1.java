package coders.assignments.arrays;

public class SortArray1 {
    static void main(String[] args) {
        int[] arr = {5,2,8,1};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int sort_arr: arr){
            System.out.print(sort_arr + " ");
        }
    }
}

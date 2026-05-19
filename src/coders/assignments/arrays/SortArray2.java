package coders.assignments.arrays;

public class SortArray2 {
    static void main(String[] args) {
        int[] arr = {5,2,8,1};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int sorted_arr: arr){
            System.out.print(sorted_arr + " ");
        }
    }
}

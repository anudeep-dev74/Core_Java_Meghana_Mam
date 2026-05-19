package coders.assignments.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public void moveZeros(int[] nums){

        int size = nums.length;
        if(size == 0 || size == 1){
            return;
        }

        int nz = 0, z = 0;
        while(nz < size){
            if(nums[nz] != 0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,2};
        MoveZerosToEnd mxt = new MoveZerosToEnd();
        mxt.moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}

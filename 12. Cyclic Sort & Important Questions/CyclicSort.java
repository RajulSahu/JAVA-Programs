package com.rajul;
import java.util.*;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // When give numbers from range 1 to N or 0 to N always use Cyclic Sort Algorithm.
    // V.V.V.V.V.V.V.V.V.V.V.V.V. IMP CONCEPT.
    static void cyclicSort(int[] arr){
        int i = 0;
        int temp;
        while(i < arr.length){
            int correct_index = arr[i] - 1;
            if(arr[i] != arr[correct_index]){
                temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            }
            else{
                i++;
            }
        }
    }
}

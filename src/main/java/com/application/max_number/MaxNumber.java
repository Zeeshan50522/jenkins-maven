package com.application.max_number;

public class MaxNumber {

    public static int findMax(int[] arr){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = new int[]{3, 4, 2, 5, 8, 1};
        System.out.println(findMax(arr));
    }
}

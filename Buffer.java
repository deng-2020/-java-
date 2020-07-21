package com.hit.demo3;

public class Buffer {
    public static void bubbleSort(int [] a){
        int i;
        int j;

        for (i = 0; i < a.length; i++){
            for (j = 1; j < a.length; j++){
                if(a[j-1] < a[j]) {
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
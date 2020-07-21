package com.hit.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class select {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\PY文件\\random_number.txt");
        Scanner scanner = new Scanner(file);
        int[] myInts = new int[100000];
        int mySpot = 0;
        while(scanner.hasNextLine()){
            String s = scanner.nextLine();
            myInts[mySpot] = Integer.parseInt(s);
            mySpot++;
        }
        long startTime = System.currentTimeMillis();
        Buffersort.bubbleSort(myInts);
        long time = System.currentTimeMillis();
        long TotalTime = time - startTime;

        int k = myInts.length / 2;

        System.out.println(myInts[k]);

        System.out.println("Time: " + TotalTime + "ms");
    }

    public static class Buffersort {
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
}

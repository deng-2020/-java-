package com.hit.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class K_max {
    public static void main(String[] args) throws FileNotFoundException{
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
        K_max.queue.find(myInts, (myInts.length / 2));
        long time = System.currentTimeMillis();
        long TotalTime = time - startTime;

        System.out.println("Time: " + TotalTime + "ms");
    }

    public static class queue{
        public static void find(int [] a, int k){
            int [] lst = new int[k];
            for (int l = 0; l < k; l++){
                lst[l] = a[l];
            }

            Buffer.bubbleSort(lst);

            for (int i = k; i < a.length; i++){
                if (a[i] < lst[k - 1]){
                    continue;
                }
                else{
                    for (int j = 0; j < k; j++){
                        if (a[i] > lst[j]){
                            for (int n = k - 2; n >= j; n--){
                                lst[n + 1] = lst[n];
                            }
                            lst[j] = a[i];
                            break;
                        }
                    }
                }
            }

            System.out.println(lst[k - 1]);
        }
    }
}

package com.hit.demo3;

public class test1_3 {
    public static void main(String [] args){
        out(1234.56789);
        out(-1234.56789);
        out(0.123456789);
        out(-0.01002000300004000005);
        out(0.00001);
    }

    public static void out(double num){
        if (num < 0){
            num *= -1;
            System.out.print("-");
        }

        int zhengshu = (int)num;
        printInt(zhengshu);
        System.out.print(".");
        printDouble(num - zhengshu);
        System.out.println();
    }

    public static void printInt(int zhengshu){
        if(zhengshu >= 10){
            printInt(zhengshu / 10);
        }
        System.out.print(zhengshu % 10);
    }

    public static void printDouble(double xiaoshu){
        if (xiaoshu < 1 && xiaoshu > 1e-6){
            System.out.print((int)(xiaoshu * 10) % 10);
            printDouble(xiaoshu * 10 - (int)(xiaoshu*10));
        }
    }
}

package com.ly;

import java.util.Scanner;

/**
 * Created by Liuying on 2018/10/24.
 */
public class Exercise {
    public static void main(String[] args) {
//        Scanner scanner= new Scanner();
         int m = 101;
        int n = 200;
        int count = 0;
        //统计素数个数
        for(int i=m;i<n;i++){
            if(isPrime(i)){
                count++;
                System.out.print(i+" ");
                if(count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("在"+m+"和"+n+"之间共有"+count+"个素数");
    } //判断素数
    private static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 1)
            flag = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if ((n % i) == 0 || n == 1) {
                    flag = false;
                    break;
                } else
                    flag = true;
            }
        }
        return flag;
    }
       /* int count = 0;
        for(int i=101; i<200; i++) {
            boolean b = false;
            for(int j=2; j<=Math.sqrt(i); j++)
            {
                if(i % j == 0) {
                    b = false;
                    break;
                }
                else {
                    b = true;
                }
            }
            if(b == true) {
                count ++;
                System.out.println(i );
            }
        }
        System.out.println( "素数个数是: " + count);*/

}

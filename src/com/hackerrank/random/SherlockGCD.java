package com.hackerrank.random;

import java.util.Scanner;

/**
 * Created by manish.sharan on 21/12/14.
 */
public class SherlockGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numTests = scanner.nextLine();
        for(int i=0;i<Integer.valueOf(numTests);i++){
            String numValue = scanner.nextLine();
            String[] values = scanner.nextLine().split(" ");
            boolean hasPrime = true;
            for(int j=0;j<values.length;j++){
                if(isPrime(Integer.valueOf(values[j]))) continue;
                else{
                    hasPrime = false;
                    break;
                }
            }
            if(hasPrime) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isPrime(Integer value){
        boolean result = true;
        for(int i=1;i<value/2;i++){
            if(value%i==0){
                result=false;
                break;
            }
        }
        return result;
    }
}

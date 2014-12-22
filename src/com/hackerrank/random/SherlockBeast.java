package com.hackerrank.random;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by manish.sharan on 18/12/14.
 */
public class SherlockBeast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numTestCase = scanner.nextLine();
        for(int i=0;i<Integer.valueOf(numTestCase);i++){
            String value = scanner.nextLine();
            int valueNum = Integer.valueOf(value);
            if(valueNum>2) {
                int numFives = getDecentNum(valueNum);
                if(numFives>=0){
                    for (int j = 0; j < numFives; j=j+3) {
                        System.out.print("555");
                    }
                    for (int k = 0; k < valueNum-numFives; k=k+5) {
                        System.out.print("33333");
                    }
                }
                else System.out.print("-1");
            }else System.out.print("-1");
            System.out.println();
        }
    }

    public static int getDecentNum(Integer value){
        if(value==3){
            return 3;
        }if(value>=5) {
            if (value % 5 == 0 && value % 3 == 0){
                return value;
            }
            if (value % 3 != 0) return calculateOnFrequentReductions(value);
            if (value % 3 == 0) {
                return value;
            }
            if (value % 5 == 0) {
                return 0;
            }
        }
        return -1;
    }

    public static int calculateOnFrequentReductions(int value){
        int reduced = 5;
        while((value-reduced)%3!=0){
            reduced += 5;
        }
        if(reduced>value){
            return -1;
        }
        else{
            return value-reduced;
        }
    }
}

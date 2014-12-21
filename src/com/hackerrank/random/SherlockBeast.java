package com.hackerrank.random;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by manish.sharan on 18/12/14.
 */
public class SherlockBeast {

    public static final int cutoff = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numTestCase = scanner.nextLine();
        for(int i=0;i<Integer.valueOf(numTestCase);i++){
            String value = scanner.nextLine();
            System.out.println(getDecentNum(Integer.valueOf(value)));
        }
    }

    public static BigInteger getDecentNum(Integer value){
        if(value<3){
            return new BigInteger("-1");
        }if(value==3){
            return new BigInteger("555");
        }if(value>=5) {
            if (value % 5 == 0 && value % 3 == 0){
                StringBuilder stringBuilder = new StringBuilder();
                for(int i=0;i<value/5;i++){
                    stringBuilder.append("55555");
                }
                return new BigInteger(stringBuilder.toString());
            }
            BigInteger returned = new BigInteger("0");
            if (value % 3 != 0) return calculateOnFrequentReductions(value);
            if (value % 3 == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                int iterations = value / 3;
                for (int i = 0; i < iterations; i++) {
                    stringBuilder.append("555");
                }
                return new BigInteger(stringBuilder.toString());
            }
            if (value % 5 == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                int iterations = value / 5;
                for (int i = 0; i < iterations; i++) {
                    stringBuilder.append("33333");
                }
                return new BigInteger(stringBuilder.toString());
            }
        }
        return new BigInteger("-1");
    }

    public static BigInteger calculateOnFrequentReductions(int value){
        int reduced = 0;
        StringBuilder stringBuilder = new StringBuilder("0");
        while((value-reduced)%3!=0){
            reduced += 5;
        }
        if(reduced>value){
            return new BigInteger("-1");
        }
        else{
            for(int i=0;i<value-reduced;i++){
                stringBuilder.append("5");
            }
            for(int i=0;i<reduced;i=i+5){
                stringBuilder.append("33333");
            }
            return new BigInteger(stringBuilder.toString());
        }
    }
}

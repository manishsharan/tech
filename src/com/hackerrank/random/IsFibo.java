package com.hackerrank.random;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by manish.sharan on 16/12/14.
 */
public class IsFibo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numTestCases = Integer.valueOf(scanner.nextLine());
        List<String> numList = new ArrayList<String>();
        for(int i=0;i<numTestCases;i++){
            numList.add(scanner.nextLine());
        }
        for(String num:numList){
            if(isFibo(num)) System.out.println("IsFibo");
            else System.out.println("IsNotFibo");
        }
    }

    public static boolean isFibo(String num){
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("1");
        BigInteger z = x;
        BigInteger number = new BigInteger(num);
        while(z.compareTo(number)< 0){
            z = x.add(y);
            x = y;
            y = z;
        }
        if(z.equals(number)) {
            return true;
        }else{
            return false;
        }
    }
}

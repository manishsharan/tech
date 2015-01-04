package com.hackerrank.BitMagic;

import java.util.Scanner;

/**
 * Created by manish.sharan on 03/01/15.
 */
public class Multiple3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        checkMultiple3(num);
    }

    public static void checkMultiple3(int num){
        int evenBit=0,oddBit = 0;
        if(num<0) num = -num;
        while(num>0){
            if((num&1)==1) oddBit++;
            num = num>>1;
            if((num&1)==1) evenBit++;
            num = num>>1;
        }
        if(oddBit-evenBit==0){
            System.out.println("Multiple");
            return;
        }else if(oddBit-evenBit==1){
            System.out.println("Non-Multiple");
            return;
        }else{
            checkMultiple3(oddBit-evenBit);
        }
    }
}

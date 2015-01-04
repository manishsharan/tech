package com.hackerrank.BitMagic;

import java.util.Scanner;

/**
 * Created by manish.sharan on 03/01/15.
 */
public class Parity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int countBits  = 0;
        while(input>0){
            if((input & 1) == 1) countBits++;
            input = input>>1;
        }
        System.out.println(countBits);
        if(countBits%2==0){
            System.out.println("Even Parity");
        }else{
            System.out.println("Odd Parity");
        }
    }
}

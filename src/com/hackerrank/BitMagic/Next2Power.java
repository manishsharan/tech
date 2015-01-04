package com.hackerrank.BitMagic;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.Scanner;

/**
 * Created by manish.sharan on 02/01/15.
 */
public class Next2Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        // 5 - 0101
        //8 - 1000
        //16 - 10000
        //num = num << 1
        if(Integer.bitCount(num)==1 && Integer.toBinaryString(num).startsWith("1")){
            System.out.println(num);
            return;
        }
        String binary = Integer.toBinaryString(num);
        binary = binary.replace('1','0');
        binary = "1"+binary;
        System.out.println(Integer.parseInt(binary,2));
    }
}

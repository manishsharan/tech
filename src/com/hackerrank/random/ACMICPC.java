package com.hackerrank.random;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by manish.sharan on 02/01/15.
 */
public class ACMICPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int numPeople = Integer.valueOf(inputs[0]);
        int maxBits = 0;
        int maxPairs = 0;
        List<String> inputList = new ArrayList<String>();
        for(int i=0;i<numPeople;i++){
            inputList.add(scanner.nextLine());
        }
        for(int i=0;i<inputList.size();i++){
            for(int j=i+1;j<inputList.size();j++) {
                String first = inputList.get(i);
                String second = inputList.get(j);
                int setBits = countORSetBits(first, second);
                if (maxBits < setBits) {
                    maxBits = setBits;
                    maxPairs = 1;
                } else if (maxBits == setBits) {
                    maxPairs++;
                }
            }
        }
        System.out.println(maxBits);
        System.out.println(maxPairs);
    }

    public static int countORSetBits(String first, String second){
        int setBitCount = 0;
        int length = first.length();
        for(int i=0;i<length;i++){
            if(first.charAt(i)==second.charAt(i)){
                int bit = first.charAt(i)=='1'? 1 : 0;
                setBitCount += bit;
            }else {
                setBitCount++;
            }
        }
        return setBitCount;
    }

}

package com.hackerrank.random;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * Created by manish.sharan on 21/12/14.
 */
public class FillingJars {

    private static BigInteger totalCandy = new BigInteger("0");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jarOpsNum = scanner.nextLine();
        String[] jarOpsArray = jarOpsNum.split(" ");
        BigInteger jarNum = new BigInteger(jarOpsArray[0]);
        Integer operations = Integer.valueOf(jarOpsArray[1]);
        for(int i=0;i<operations;i++){
            String indexCandyNum = scanner.nextLine();
            String[] indexCandyArray = indexCandyNum.split(" ");
            BigInteger boxA = new BigInteger(indexCandyArray[0]);
            BigInteger boxB = new BigInteger(indexCandyArray[1]);
            BigInteger inputNum = new BigInteger(indexCandyArray[2]);
            BigInteger totalBoxes = new BigInteger("1");
            if(boxB.compareTo(boxA)==1){
                totalBoxes = totalBoxes.add(boxB.add(boxA.negate()));
            }else{
                totalBoxes = totalBoxes.add(boxA.add(boxB.negate()));
            }
            totalCandy = totalCandy.add(totalBoxes.multiply(inputNum));
        }
        System.out.println(totalCandy);
        System.out.print(Math.round(totalCandy.divide(jarNum).doubleValue()));
    }
}

package com.hackerrank.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by manish.sharan on 16/12/14.
 */
public class FindDigits {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> numbersList = new ArrayList<String>();
        String testCaseNumbers = scanner.nextLine();
        for(int i=0;i<Integer.valueOf(testCaseNumbers);i++){
            numbersList.add(scanner.nextLine());

        }
        for(String num:numbersList){
            char[] numArray = num.toCharArray();
            int count = 0;
            for(int i=0;i<numArray.length;i++){
                if(numArray[i]>=57 && numArray[i]<=49){
                    break;
                }else if(numArray[i]==48){
                    continue;
                }else{
                   if(Integer.valueOf(num)%Character.getNumericValue(numArray[i])==0) count++;
                }
            }
            System.out.println(count);
        }
    }
}

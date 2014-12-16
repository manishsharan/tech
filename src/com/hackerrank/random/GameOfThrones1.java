package com.hackerrank.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by manish.sharan on 16/12/14.
 */
public class GameOfThrones1 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        char[] inputArray = inputString.toCharArray();
        Map<Character,Integer> inputArrayMap = new HashMap<Character,Integer>();
        for(char inputChar:inputArray){
            if(inputArrayMap.containsKey(inputChar)){
                int charCount = inputArrayMap.get(inputChar)+1;
                inputArrayMap.put(inputChar,charCount);
            }else{
                inputArrayMap.put(inputChar,1);
            }
        }
        String ans = "YES";
        if(inputArray.length%2==0){
            for(Map.Entry<Character,Integer> arrayMapEntry:inputArrayMap.entrySet()){
                if(arrayMapEntry.getValue()%2==0) continue;
                else{ans="NO"; break;}
            }
        }else{
            int allowedOddKeys = 0;
            for(Map.Entry<Character,Integer> arrayMapEntry:inputArrayMap.entrySet()){
                if(arrayMapEntry.getValue()%2!=0){allowedOddKeys++; continue;}
            }
            if(allowedOddKeys > 1){
               ans = "NO";
            }
        }

        System.out.println(ans);
        myScan.close();
    }
}

package com.hackerrank.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by manish.sharan on 23/12/14.
 */
public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCase = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<numTestCase;i++){
            String input = scanner.nextLine();
            char[] charArray = input.toCharArray();
            if(charArray.length%2!=0){
                System.out.println(-1);
            }else{
                findSubstitution(charArray);
            }
        }
    }

    public static void findSubstitution(char[] charArray){
        Map<Character,Integer> charArrayMap1 = new HashMap<Character, Integer>();
        Map<Character,Integer> charArrayMap2 = new HashMap<Character, Integer>();
        for(int i=0;i<charArray.length/2;i++){
            if(charArrayMap1.containsKey(charArray[i])){
                int countA = charArrayMap1.get(charArray[i]);
                countA += 1;
                charArrayMap1.put(charArray[i],countA);
            }else{
                charArrayMap1.put(charArray[i],1);
            }
        }
        for(int j=charArray.length/2;j<charArray.length;j++){
            if(charArrayMap2.containsKey(charArray[j])){
                int countB = charArrayMap2.get(charArray[j]);
                countB += 1;
                charArrayMap2.put(charArray[j],countB);
            }else{
                charArrayMap2.put(charArray[j],1);
            }
        }
        int substitutions = 0;
        for(Map.Entry<Character,Integer> entry : charArrayMap1.entrySet()){
            if(charArrayMap2.containsKey(entry.getKey())){
                int array2Val = charArrayMap2.get(entry.getKey());
                if(charArrayMap1.get(entry.getKey()) - array2Val > 0) substitutions += (charArrayMap1.get(entry.getKey())-array2Val);
                else substitutions += 0;
            }else{
                substitutions += charArrayMap1.get(entry.getKey());
            }
        }
        System.out.println(substitutions);
    }
}

package com.hackerrank.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by manish.sharan on 23/12/14.
 */
public class CommonChild {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        Map<Character,Integer> aCharMap = createCharCountMap(aChar);
        Map<Character,Integer> bCharMap = createCharCountMap(bChar);
        int commonChildLength = 0;
        for(Map.Entry<Character,Integer> aCharMapEntry:aCharMap.entrySet()){
            if(bCharMap.containsKey(aCharMapEntry.getKey())){
                if(bCharMap.get(aCharMapEntry.getKey())>=aCharMap.get(aCharMapEntry.getKey())){
                    commonChildLength += aCharMap.get(aCharMapEntry.getKey());
                }else{
                    commonChildLength += bCharMap.get(aCharMapEntry.getKey());
                }
            }
        }
        System.out.print(commonChildLength);
    }

    public static Map<Character,Integer> createCharCountMap(char[] charArray){
        Map<Character,Integer> charCountMap = new HashMap<Character, Integer>();
        for(char aChar:charArray){
            if(charCountMap.containsKey(aChar)){
                int count = charCountMap.get(aChar);
                charCountMap.put(aChar,count+1);
            }else{
                charCountMap.put(aChar,1);
            }
        }
        return charCountMap;
    }
}

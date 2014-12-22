package com.hackerrank.String;

import java.util.*;

/**
 * Created by manish.sharan on 23/12/14.
 */
public class GemStones {
    public static void main(String[] args) {
        int gemElement = 0;
        Scanner scanner = new Scanner(System.in);
        int numTestCases = Integer.valueOf(scanner.nextLine());
        List<String> inputStrings = new ArrayList<String>();
        Map<String,Integer> inputStringMap = new HashMap<String, Integer>();
        for(int i=0;i<numTestCases;i++){
            inputStrings.add(scanner.nextLine());
        }
        inputStringMap = removeDuplicates(inputStrings);
        int maxVal = 0;
        String maxValString = "";
        for(Map.Entry<String,Integer> inputStringEntry:inputStringMap.entrySet()){
            if(inputStringEntry.getValue()>maxVal) {
                maxVal = inputStringEntry.getValue();
                maxValString=inputStringEntry.getKey();
            }
        }
        char[] maxValStringArray = maxValString.toCharArray();
        for(char maxValStringChar:maxValStringArray){
            int count = 0;
            for(String input:inputStrings){
                if(input.contains(String.valueOf(maxValStringChar))){
                    count++;
                    continue;
                }else{
                    break;
                }
            }
            if(count == inputStrings.size()){
                gemElement++;
            }
        }
        System.out.print(gemElement);
    }

    public static Map<String,Integer> removeDuplicates(List<String> input){
        Map<String,Integer> stringLengthMap = new HashMap<String, Integer>();
        for(String inputString:input){
            char[] inputStringArray = inputString.toCharArray();
            Set<Character> stringArraySet = new HashSet<Character>();
            for(char stringArray:inputStringArray){
                stringArraySet.add(stringArray);
            }
            String tempString = stringArraySet.toString().replace(",","");
            stringLengthMap.put(tempString,tempString.length());
        }
        return stringLengthMap;
    }
}

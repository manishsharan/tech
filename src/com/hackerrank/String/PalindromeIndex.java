package com.hackerrank.String;

import java.util.Scanner;

/**
 * Created by manish.sharan on 23/12/14.
 */
public class PalindromeIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCase = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<numTestCase;i++){
            String input = scanner.nextLine();
            int index = verifyForPalindrome(input);
            System.out.println(index);
        }
    }

    public static int verifyForPalindrome(String value){
        int indexForRemoval = -1;
        char[] charArray = value.toCharArray();
        for(int i=0,j=charArray.length-1;i<charArray.length/2;i++,j--){
            if(i>=j){
                break;
            }
            else if(charArray[i]==charArray[j]){
                continue;
            }else{
                if(charArray[i]==charArray[j-1] && charArray[i+1]==charArray[j-2]){
                    indexForRemoval = j;
                }else indexForRemoval = i;
                break;
            }
        }
        return indexForRemoval;
    }
}

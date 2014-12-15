package com.hackerrank.random;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by manish.sharan on 16/12/14.
 */
public class Pangram {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.toLowerCase();
        char[] characters = line.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        for(int i=0;i<characters.length;i++){
            if(characters[i]>=97 && characters[i]<=122) charSet.add(characters[i]);
        }
        if(charSet.size()==26 ){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
}

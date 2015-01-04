package com.hackerrank.BitMagic;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by manish.sharan on 05/01/15.
 */
public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Stack<Character> myStack = new Stack<Character>();
        while(input!=0){
            if((input&1)==0) myStack.push('0');
            else myStack.push('1');
            input=input>>1;
        }
        int iterations = myStack.size();
        for(int i=0;i<iterations;i++){
            System.out.print(myStack.pop());
        }
    }
}

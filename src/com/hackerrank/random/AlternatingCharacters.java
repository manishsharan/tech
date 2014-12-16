package com.hackerrank.random;

import java.util.*;

/**
 * Created by manish.sharan on 16/12/14.
 */
public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> seqList = new ArrayList<String>();
        String testCaseNumbers = scanner.nextLine();
        for(int i=0;i<Integer.valueOf(testCaseNumbers);i++){
            seqList.add(scanner.nextLine());
        }
        for(String seq:seqList){
            Stack<Character> myStack = new Stack<Character>();
            int deleted = 0;
            char[] seqArray = seq.toCharArray();
            List<Character> seqLinkedList = new LinkedList<Character>();
            int count = 0;
            for(int i=0;i<seqArray.length;i++){
                if(myStack.isEmpty()) myStack.push(seqArray[i]);
                else{
                    if(myStack.peek()!=seqArray[i]) myStack.push(seqArray[i]);
                    else deleted++;
                }
            }
            System.out.println(deleted);
        }
    }
}

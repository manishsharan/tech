    package com.hackerrank.random;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    /**
     * Created by manish.sharan on 16/12/14.
     */
    public class LoveLetterMystry {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String testCaseCount = scanner.nextLine();
            List<String> inputList = new ArrayList<String>();
            for(int i=0;i<Integer.valueOf(testCaseCount);i++){
                inputList.add(scanner.nextLine());
            }
            for(String input:inputList){
                int count = 0;
                char[] inputArray = input.toCharArray();
                for(int i=0;i<inputArray.length/2;i++){
                    if(inputArray[i]>inputArray[inputArray.length-i-1]){
                        count+=decreaseCharValue(inputArray[i],inputArray[inputArray.length-i-1]);
                    }else{
                        count+=decreaseCharValue(inputArray[inputArray.length-i-1],inputArray[i]);
                    }
                }
                System.out.println(count);
            }
        }

        public static int decreaseCharValue(char base, char characterToBeDecreased){
           return base-characterToBeDecreased;
        }
    }

package org.example;


import java.util.Stack;

public class Main {
    public static boolean checkForPalindrome(String words){
        words = words.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String rev = "";
        for(int i = words.length()-1; i>= 0; i--){
            rev = rev + words.charAt(i);

        }
        return words.equals(rev);
    }
   public static String convertDecimalToBinary(int x){
        if(x == 0){
            return "0";
        }
       Stack<Integer> stack = new Stack<>();
        StringBuilder binaryString = new StringBuilder();
        while(x > 0){
            int remainder = x % 2;
            stack.push(remainder);
            x = x/2;
        }
        while (!stack.isEmpty()){
            binaryString.append(stack.pop());
        }
        return binaryString.toString();

   }

    public static void main(String[] args) {
        String words = new String("I did, did I?");
        String words1 = new String("Racecar");
        String words2 = new String("hello");
        String words3 = new String("Was it a car or a cat I saw ?");

        boolean res = checkForPalindrome(words);
        if(res){
            System.out.println("\""+words+"\" is a palindrome.");
        } else {
            System.out.println("\""+words+"\" is not a palindrome.");
        }
        boolean res1 = checkForPalindrome(words1);

        if(res1){
            System.out.println("\""+ words1 +"\" is a palindrome.");
        } else {
            System.out.println("\""+ words1 +"\" is not a palindrome.");
        }
        boolean res2 = checkForPalindrome(words2);
        if(res2){
            System.out.println("\""+ words2 +"\" is a palindrome.");
        } else {
            System.out.println("\""+ words2 +"\" is not a palindrome.");
        }
        boolean res3 = checkForPalindrome(words3);
        if(res3){
            System.out.println("\""+ words3 +"\" is a palindrome.");
        } else {
            System.out.println("\""+ words3 +"\" is not a palindrome.");
        }
        int number1 = 5;
        int number2 = 6;
        int number3 = 13;
        int number4 = 0;

        System.out.println(number1 + " in binary is: " + convertDecimalToBinary(number1)); // 101
        System.out.println(number2 + " in binary is: " + convertDecimalToBinary(number2)); // 110
        System.out.println(number3 + " in binary is: " + convertDecimalToBinary(number3)); // 1101
        System.out.println(number4 + " in binary is: " + convertDecimalToBinary(number4)); // 0

    }



}
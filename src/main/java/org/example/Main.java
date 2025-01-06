package org.example;


import java.util.Stack;

public class Main {

        public static void main(String[] args) {

            System.out.println(checkForPalindrome("I did, did I?"));
            System.out.println(checkForPalindrome("Racecar"));
            System.out.println(checkForPalindrome("hello"));
            System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
            System.out.println(convertDecimalToBinary(5));
            System.out.println(convertDecimalToBinary(6));
            System.out.println(convertDecimalToBinary(13));

        }


    public static boolean checkForPalindrome(String input) {
        // Giriş string'ini temizle: sadece harf ve rakamları al, küçük harfe çevir
        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false; // Eğer karakterler eşleşmiyorsa, palindrom değildir
            }
            left++;
            right--;
        }

        return true; // Tüm karakterler eşleşiyorsa, palindromdur
    }

    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
    }


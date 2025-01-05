package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(checkForPalindrome("I did, did I?"));
    }
    public static boolean checkForPalindrome(String text){
        if (text == null || text.isEmpty()) {
            return false;
        }

        String clearedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedText = new StringBuilder(clearedText).reverse().toString();
        return reversedText.equals(clearedText);
    }

    public static String convertDecimalToBinary(int decimal) {
        // Boş bir Stack oluşturuluyor
        Stack<Integer> stack = new Stack<>();

        // Decimal sayıyı ikilik tabana çevirme işlemi
        while (decimal > 0) {
            stack.push(decimal % 2); // Kalanı yığına ekle
            decimal = decimal / 2;   // Sayıyı 2'ye böl
        }

        // Yığındaki elemanları çıkararak binary değeri oluşturuyoruz
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop()); // Yığından her elemanı çıkarıp binary'ye ekle
        }

        return binary.toString(); // Sonuç olarak binary sayıyı döndür
    }
}

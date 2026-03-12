package org.testleaf.week1.week1homeassignment;

public class PalindromeNumber {
    public static void main(String[] args) {
         int num = 12321;
        int original = num;
        int reverse = 0;

        for (int i = num; i > 0; i = i / 10) {

            int digit = i % 10;          
            reverse = reverse * 10 + digit;  
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        
    }

}
}

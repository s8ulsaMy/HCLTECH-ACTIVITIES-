package OOPS;
public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int reversedNum = 0, remainder;
        
        // Store the original number to compare later
        int originalNum = num;
        
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is not a Palindrome.");
        }
    }
}
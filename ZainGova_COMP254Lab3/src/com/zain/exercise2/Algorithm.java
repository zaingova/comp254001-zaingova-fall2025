package com.zain.exercise2;

/* Write a short recursive Java method that determines if a string s is a palindrome, that is, it is equal
to its reverse. Examples of palindromes include 'racecar' and 'gohangasalamiimalasagnahog'. Test the
method by asking the user to provide string entries to be checked. Hint: Check the equality of
the first and last characters and recur (but be careful to return the correct value for both odd and
even-length strings). */

public class Algorithm {
    public static boolean IsPalindrome(String s) {
       if (s.length() <= 1) {
           return true; // single-char strings are palindromes
       }

       if (s.charAt(0) != s.charAt(s.length() - 1)) {
           return false;
       }

       return IsPalindrome(s.substring(1, s.length() - 1));
    }
}

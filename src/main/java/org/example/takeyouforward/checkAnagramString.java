package org.example.takeyouforward;

import java.util.Arrays;

public class checkAnagramString {
    public static void main(String agrs[]){
        //Two strings are anagrams if they contain the same characters in the same frequency, regardless of the order.
        String str1 = "listen";
        String str2 = "silent";

        boolean result = isAnagram(str1, str2);
        System.out.println("Are they anagrams? " + result);
    }

    private static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, not anagram
        if (str1.length() != str2.length()) return false;

        // Convert to char array and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}

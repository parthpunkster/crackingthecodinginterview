package com.company;

import java.util.Arrays;

public class Main {
    public static String sortString(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public static Boolean checkpermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return sortString(s1).equals(sortString(s2));

    }

    public static Boolean checkpermutation1(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] letterCount = new int[128];
        for (int i = 0; i<s1.length();i++) {
            letterCount[s1.charAt(i)]++;
        }
        for (int i =0; i <s2.length();i++) {
            letterCount[s2.charAt(i)]--;
            if (letterCount[s2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	// write your code here
        if (checkpermutation1("Parth","Parth")){
            System.out.println("Both the strings are permutation of each other");
        }
        else {
            System.out.println("Both the strings are not permutation of each other");
        }
    }
}

package com.company;

import java.util.Arrays;

public class Main {
    private static Boolean isUnique(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] letter = new boolean[128];
        for (int i = 0;i <str.length(); i++) {
            if (letter[str.charAt(i)]) {
                return false;
            }
            letter[str.charAt(i)] = true;
        }
        return true;

    }
    private static Boolean isUnique2(String str) {
        str = str.toLowerCase();
        char[] letter = new char[str.length()];
        letter = str.toCharArray();
        Arrays.sort(letter);
        for (int i = 0; i< letter.length-1; i++) {
            if (letter[i] == letter[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	// write your code here
        if(isUnique2("PArtH")) {
            System.out.println("It contains all unique characters");
        }
        else {
            System.out.println("It Contains duplicated characters");
        }
    }
}

package com.company;

public class Main {

    public static void palperm(String s) {
        int[] table = charFrequencyGenerator(s);
        if (checkForodd(table)) {
            System.out.println("The string is palindrome permutation");
        }
        else System.out.println("The string is not palindrome permutation");
    }

    public static Boolean checkForodd(int[] table) {
        boolean oddCount = false;
        for (int count:table) {
            if (count % 2 !=0) {
                if (oddCount) {
                    return false;
                }
                oddCount = true;
            }
        }
        return true;
    }

    public static int inc(char c) {
        int val = c;
        int a = 'a';
        int z = 'z';
        if (val >= a && val <= z) {
            return val-a;
        }
        else return -1;
    }

    public static int[] charFrequencyGenerator(String s) {
        s = s.toLowerCase();
        int[] table = new int[26];
        for (int i = 0; i< s.length();i++) {
            int pos = inc(s.charAt(i));
            if (pos != -1) {
                table[pos]++;
            }
        }
        return table;
    }

    public static void main(String[] args) {
	// write your code here
        palperm("Tact Coa");
    }
}

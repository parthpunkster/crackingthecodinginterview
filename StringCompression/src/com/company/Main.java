package com.company;


public class Main {

    public static String compress(String str) {
        int finallength = countCompress(str);
//        System.out.println(finallength);
        if (finallength > str.length()) {
            return str;
        }
        int countConsecutive = 0;
        StringBuilder result = new StringBuilder(finallength);
        for (int i = 0; i< str.length();i++) {
            countConsecutive++;
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                result.append(str.charAt(i));
                result.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return result.toString();

    }

    public static int countCompress(String str) {
        int compressedLength = 0;
        int countConsectuive = 0;
        for (int i =0; i<str.length();i++) {
            countConsectuive++;
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressedLength += 1+String.valueOf(countConsectuive).length();
                countConsectuive = 0;
            }
        }
        return compressedLength;
    }

    public static String compressBad(String str) {
        int countConsecutive = 0;
//        String result = "";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i< str.length();i++) {
            countConsecutive++;
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
//                result = result +str.charAt(i)+countConsecutive;
                res.append(str.charAt(i));
                res.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return res.length() < str.length() ? res.toString() : str;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(compress("aaabbb"));
    }
}

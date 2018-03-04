package com.company;

public class Main {

    public static void permutation (String result, String str) {
        int len = str.length();
        if (len ==0) {
            System.out.println(result);
        }
        else {
            for (int i =0; i < len; i++) {
                permutation(result+str.charAt(i),str.substring(0,i) + str.substring(i+1));
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
//        String s = "Parth";
//        System.out.println(s.substring(0,3));
        permutation("","abc");
//        char[] test = new char[] {'a','b','c'};
//        swap(test);
    }
}

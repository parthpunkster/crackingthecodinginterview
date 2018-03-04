package com.company;

public class Main {

    public static boolean oneAwayModified(String first, String second) {
        if (first.length() - second.length() > 1) {
            return false;
        }
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;

        boolean differenceFound = false;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (differenceFound) {
                    return false;
                }
                differenceFound = true;
                if (s1.length() == s2.length()) {
                    index1++;
                }
            }
            else {
                index1++;
            }
            index2++;
        }
        return true;
    }

    public static boolean oneReplaceAway(String s1, String s2) {
        boolean onlyOneAway = false;
        for (int i = 0; i< s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (onlyOneAway) {
                    return false;
                }
                onlyOneAway = true;
            }
        }
        return true;
    }

    public static boolean oneEditAway(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            }
            else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static boolean oneAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return oneReplaceAway(s1,s2);
        }
        if (s1.length()+1 == s2.length()) {
            return oneEditAway(s1,s2);
        }
        if (s1.length()-1 == s2.length()) {
            return oneEditAway(s2,s1);
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        if (oneAwayModified("parth","rth")) {
            System.out.println("One Step away");
        }

    }
}

package com.company;

public class Main {

    public static boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector -1)) == 0;
    }

    public static int toggle(int bitVector,int index) {
        if (index < 0) {
            return bitVector;
        }
        int mask = 1 << index;
        if ((bitVector & mask) == 0) {
            bitVector |= mask;
        }
        else {
            bitVector &= ~mask;
        }
        return bitVector;
    }

    public static int createVector(String str) {
        int bitVector = 0;
        for (char c: str.toCharArray()) {
            int x = c;
            bitVector = toggle(bitVector,x);
        }
        return bitVector;
    }

    public static boolean isPalinddromePermutation(String str) {
        int bitVector = createVector(str);
        return bitVector==0 || checkExactlyOneBitSet(bitVector);
    }

    public static void main(String[] args) {
	// write your code here
        if (isPalinddromePermutation("tat")) {
            System.out.println("Palinperm");
        }
        else {
            System.out.println("Not plainperm");
        }
    }
}

package com.company;

public class Main {

    public static String urlify(char[] str, int truelength) {
        int spacecount = 0,index = 0;
        for (int i =0; i<truelength; i++) {
            if (str[i] == ' ') {
                spacecount++;
            }
        }
        index = truelength + spacecount*2;
        for (int i = truelength-1; i >= 0; i--) {
            if (str[i] == ' '){
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index -= 3;
            }
            else {
                str[index-1] = str[i];
                index--;
            }

        }
        return new String(str);
    }
    public static void main(String[] args) {
	// write your code here
        char[] s = new char[]{'p',' ','a',' ','r',' ',' ',' ',' ',' ',' ',' '};
        System.out.println(urlify(s,5));
    }
}

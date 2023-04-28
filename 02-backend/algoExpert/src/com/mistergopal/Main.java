package com.mistergopal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String[] words = new String[]{"dog", "hello", "god"};
//        System.out.println(semordnilap(words));

        System.out.println(caesarCypherEncryptor("zab", 2));
    }

    public static ArrayList<ArrayList<String>> semordnilap(String[] words) {
        // Write your code here.
        ArrayList<ArrayList<String>> pds = new ArrayList<ArrayList<String>>();

        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                boolean reverse = true;
                if(words[i].length() != words[j].length()) {
                    System.out.println("2nd layer of looping --- words diff lengths!");
                    System.out.println(words[i] + " vs " + words[j]);
                    reverse = false;
                    continue;
                } else {
                    int len = words[i].length();
                    for(int k = 0; k < len; k++) {
                        if(!words[i].substring(k, k + 1).equals(words[j].substring(len - k - 1, len - k))) {
                            System.out.println("Innermost loop --- character mismatch");
                            System.out.println(words[i] + " vs " + words[j]);
                            reverse = false;
                            break;
                        }
                    }
                    if(reverse) {
                        ArrayList<String> match = new ArrayList<String>();
                        match.add(words[i]);
                        match.add(words[j]);
                        pds.add(match);
                    } else {
                        continue;
                    }
                }
            }
        }
        return pds;
    }

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here

        String cipher = "";

        for(int i = 0; i < str.length(); i++) {
            // check upcase/downcase
            int asc = (int)(str.charAt(i));

            if(asc >= 65 && asc <= 90) {
                // upcase
                int shift = 90 - asc - 1 + 65;
                char newChar = (char) shift;
                cipher += Character.toString(newChar);
            } else if(asc >= 97 && asc <= 122) {
                // downcase
                int shift = 122 - asc - 1 + 97;
                char newChar = (char) shift;
                cipher += Character.toString(newChar);
            } else {
                cipher += str.substring(i, i + 1);
            }
        }
        return cipher;
    }
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.

        // populate with unique competitors, add wins
        // return highest val
        // make a dict
        ArrayList<String> teams = new ArrayList<String>();
        ArrayList<Integer> scores = new ArrayList<Integer>();


        return "";

    }
}

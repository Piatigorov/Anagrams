package ru.nicotech.anagrams;

import java.io.*;

public class CharSearch {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String x1 = r.readLine();
        String x2 = r.readLine();

        if (x1.length() == x2.length()) {

            for (int i = 0; i < x1.length(); i++) {
                char ch1 = x1.charAt(i);
                x2 = x2.replaceFirst(String.valueOf(ch1), "");
            }
            if (x2.length() == 0){
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
        else{
            System.out.println("0");
        }
    }
}
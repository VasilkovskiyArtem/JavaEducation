package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFile = reader.readLine();
        InputStream inFile = new FileInputStream(pathFile);
        int minBite = inFile.read();
        while (inFile.available() > 0) {
            int data = inFile.read();
            if (data < minBite) {
                minBite = data;
            }
        }
        inFile.close();
        System.out.println(minBite);
    }
}

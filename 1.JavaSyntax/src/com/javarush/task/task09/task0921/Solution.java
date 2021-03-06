package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }
    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        List<Integer> num = new ArrayList<>();
        try {
            for (int i = 0; i <= count; i++) {
                int number = Integer.parseInt(reader.readLine());
                num.add(number);
                count++;
            }
        } catch (NumberFormatException | IOException e) {
            num.forEach(System.out::println);
        }
    }
}

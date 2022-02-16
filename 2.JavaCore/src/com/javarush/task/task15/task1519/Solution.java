package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String value = reader.readLine();
            if (value.equals("exit")) {
                reader.close();
                break;}
            try{
                if (value.contains(".")){
                    print(Double.parseDouble(value));
                }
                else if (Integer.parseInt(value)>0 && Integer.parseInt(value)<128){
                    print(Short.parseShort(value));
                }
                else {
                    print(Integer.parseInt(value));
                }
            }
            catch (Exception e){
                print(value);
            }
        }
        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

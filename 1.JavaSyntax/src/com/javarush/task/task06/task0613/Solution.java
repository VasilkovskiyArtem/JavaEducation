package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);
        // Выведи значение переменной catCount
    }

    public static class Cat {
        // Создай статическую переменную catCount
        static public int catCount;

        // Создай конструктор
        public Cat() {
            Cat.catCount++;
        }
    }
}

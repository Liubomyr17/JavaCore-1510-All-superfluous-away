package com.company;

/*
1510. Level 15 Lection 4. Все лишнее - прочь!
Убрать в методе main лишние строки, для которых метод add не реализован.

Требования:
1. В классе Solution должно быть реализовано три метода add.
2. Метод main не должен содержать вызов метода add с параметрами "1" и 2d.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.

 */

public class Solution {
    public static void main(String[] args) {
        add((short) 1, 2f); //2
        add(1, 2);       //1
        add(2d, 2);      //3
        //add("1",2d);         //error
        add((byte) 1, 2d);  //2
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }
}

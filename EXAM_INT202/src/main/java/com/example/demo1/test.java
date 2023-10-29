package com.example.demo1;

import com.example.demo1.models.RandomNumber;

public class test {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber(); // create obj
        int num1 = randomNumber.getNum1();
        int num2 = randomNumber.getNum2();
        System.out.println(num1);
        System.out.println(num2);

        if (randomNumber.isNumeric("1")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

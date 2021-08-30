package com.company;

import java.util.Random;

public class CristinaCotetiuWeek1Homework {
    // 4. Define and print on separate lines the following data types, using random values:
// a. Primitive: boolean, char, int, long, double
    static void exercise4() {
        boolean myBooleanValue = true;
        System.out.println("myBooleanValue is set to: " + myBooleanValue);

        char myCharValue = 'D';
        System.out.println("myCharValue is: " + myCharValue);

        int myIntValue = 200;
        System.out.println("myIntValue is set to: " + myIntValue);

        long myLongValue = 100_000_000L;
        System.out.println("myLongValue is set to: " + myLongValue);

        double myDoubleValue = 50.50d;
        System.out.println("myDoubleValue is set to: " + myDoubleValue);

        // b. Non primitive: String, array;
// String
        String city = "Barcelona";
        String food = "fajitas";
        System.out.println("Next year I will go to " + city + " and I will eat some " + food);

        // Array of Strings
        String[] myLetters = {"A", "B", "C", "D"};
        for (int i = 0; i < myLetters.length; i++)
            System.out.println("myLetters are displayed in a loop through array: " + myLetters[i]);

        String[] myVowels = {"A", "E", "I", "O", "U"};
        for (String i : myVowels) {
            System.out.println(i);
        }

        // Multidimensional Arrays
        int[] myInt = {1, 2, 3};
        System.out.println(myInt[1]); // This will display 2

        int[][] myNum = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}};
        int myArrNum = myNum[0][2];
        System.out.println("This will display: " + myArrNum); // This will display 3

    }
    static void exercise5() {

        // 5. Define some integer variables. Perform the operations below and print the result
// a. increment it using the unary operator
        int myBonus = 100;
        ++myBonus;
        int calculateMyBonus = myBonus + 200;
        System.out.println("My bonus is: " + calculateMyBonus); //the result is 301

        //b. perform some random arithmetic operations using the arithmetic operators
        double celsius = 5;
        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = (fahrenheit + 459.67) * 5 / 9;
        System.out.println("This is Fahrenheit value: " + fahrenheit);
        System.out.println("This is Kelvin value: " + kelvin);

        //c. compare two variables using the comparison operator
        int myFirstNum = 10;
        int mySecondNum = 20;
        System.out.println("myFirstNum is not equal to mySecondNum: " + (myFirstNum != mySecondNum));
        System.out.println("myFirstNum is equal to mySecondNum: " + (myFirstNum == mySecondNum));
        System.out.println("myFirstNum is greater than mySecondNum: " + (myFirstNum > mySecondNum));
        System.out.println("myFirstNum is less than mySecondNum: " + (myFirstNum < mySecondNum));
        System.out.println("myFirstNum is greater or equal to mySecondNum: " + (myFirstNum >= mySecondNum));
        System.out.println("myFirstNum is less or equal to mySecondNum: " + (myFirstNum <= mySecondNum));
    }
    static void exercise6() {
        // 6. Define two integer variables, a and b
// Using an if-else statement, compare the values, and
// if a is larger, print "<value of a> is larger than <value of b>"
// if b is larger, print "<value of b> is larger than <value of a>"
// if numbers are equal, print "<value of a> is equal to <value of b>"
        int a = 5;
        int b = 5;
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        } else if (b > a) {
            System.out.println(b + " is larger than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    static void exercise7() {
        // 7. Define a number array of 10 elements, using random values from range 1 to 100, which needs to include number 15;
// Using a for loop, print the values of every element on separate lines. If an element has value 15, skip printing this value.
        Random generate = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = generate.nextInt(100);
            if (array[i] != 15) {
                System.out.println("This is an array of 10 elements, but none of them is 15: " + array[i]);
            }

        }
    }
    public static void main(String[] args){
        exercise4();
        exercise5();
        exercise6();
        exercise7();
    }
}

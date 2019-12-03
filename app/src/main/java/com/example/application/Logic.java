package com.example.application;

public class Logic {

    private double radius;
    private double number;
    private int numberToReverse, numberOne, numberTwo;

    public Logic(){

    }

    public double calculateRadius(double radius){
        this.radius = radius;
        return Math.PI*radius*radius;
    }

    public boolean checkPalindrome(int number){
        this.number=number;
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = number;

        while( number != 0 )
        {
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            number = number/10;
        }

        if (originalInteger == reversedInteger){
            return true;
        }
        else{
            return false;
        }

    }

    public int reverseNumber(int numberToReverse){
        this.numberToReverse = numberToReverse;
        int reversedInteger = 0, remainder;

        while( numberToReverse != 0 )
        {
            remainder = numberToReverse % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            numberToReverse = numberToReverse/10;
        }
        return reversedInteger;
    }

    public void swapNumbers(int numberOne, int numberTwo){
        this.numberOne =  numberOne;
        this.numberTwo =  numberTwo;

        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }
}
package org.example;

public class Main {
    public static void main(String[] args){
        int sum = 5;
        double average;
        int lowerBound = 1;
        int upperBound = 100;
        for (int number = lowerBound; number<= upperBound; ++number){
            sum+=number;
            average = 1/100;
            System.out.println("the sum are: " +sum);
            System.out.println("the average: "+average);
        }
    }
}
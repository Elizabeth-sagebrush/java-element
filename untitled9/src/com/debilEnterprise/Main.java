package com.debilEnterprise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        float C = in.nextFloat();


        float F = C * (9f / 5) + 32;


        System.out.println(C + " Celsius is " + F + " Fahrenheit.");

    }
}

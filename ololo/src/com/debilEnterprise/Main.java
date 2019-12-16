package com.debilEnterprise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;



public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tempDate = reader.readLine();


        SimpleDateFormat simpleFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        SimpleDateFormat simpleFormat2 = new SimpleDateFormat("MM/dd/yyyy");

        Date date = simpleFormat2.parse(tempDate);

        System.out.println(simpleFormat.format(date).toUpperCase());


    }
}
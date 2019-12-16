package com.debilEnterprise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {

        ArrayList<String> word = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();

        for (String tmp : array)
        {
            if (isNumber(tmp))
            {
                number.add(tmp);
            } else word.add(tmp);
        }

        for (int i = 0; i < word.size(); i++)
        {
            for (int j = 0; j < word.size() - 1 - i; j++)
            {
                if (isGreaterThan(word.get(j), word.get(j + 1)))
                {
                    String tmp = word.get(j + 1);
                    word.set(j + 1, word.get(j));
                    word.set(j, tmp);
                }
            }
        }

        for (int i = 0; i < number.size(); i++)
        {
            for (int j = 0; j < number.size() - 1 - i; j++)
            {
                if (!isGreaterThan(number.get(j), number.get(j + 1)))
                {
                    String tmp = number.get(j);
                    number.set(j, number.get(j + 1));
                    number.set(j + 1, tmp);
                }
            }
        }

        int wordCount = 0;
        int numberCount = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i]))
            {
                array[i] = number.get(numberCount);
                numberCount++;
            } else
            {
                array[i] = word.get(wordCount);
                wordCount++;
            }
        }
    }


    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }}
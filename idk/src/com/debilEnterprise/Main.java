package com.debilEnterprise;

import java.io.*;



class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String   sourceFileName = reader.readLine();


        String destinationFileName = reader.readLine();
        FileInputStream fileInputStream = null;
        try
        {
            fileInputStream = new FileInputStream(sourceFileName);
        }
        catch (Exception e)
        {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = new FileInputStream(sourceFileName);
        }

        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);




        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
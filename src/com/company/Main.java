package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //CREATES AN ARRAY RANGING FROM 1-100
        int[] allNumbers = new int[100];
        for (int i = 0; i < 100; i++)
            allNumbers [i] = i;

        int[] generatedNumber = new int[100];

        int randomNumber = (int)(Math.random() * 100) + 1;
        System.out.println(randomNumber);

        if (!Contains(randomNumber, allNumbers))
            generatedNumber[1] = randomNumber;
        else
            


    }


    public static boolean Contains(int number, int[] array)
    {
        boolean contains = false;
        for(int temp : array)
        {
            if (number == temp);
            contains = true;
        }

        return contains;
    }
}

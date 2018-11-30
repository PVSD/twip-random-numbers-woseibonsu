package com.company;

import java.util.Random;

public class RandomNumbers {
    public static int RunTest()
    {
        int[] generatedNumbers = new int[100]; //CREATES THE ARRAY USED TO STORE THE RANDOM NUMBERS
        int runs = 0; //AMOUNT OF TIMES IT TOOK TO GENERATE 1-100
        int index = 0; //INDEX TO STORE THE GENERATED NUMBER IN

        //THE RANDOM NUMBER TEST
        while (true)
        {
            int randomNumber = new Random().nextInt(100) + 1; //GENERATES RANDOM NUMBER

            if (IsFull(generatedNumbers)) //CHECKS IF ALL THE RANDOM NUMBERS HAVE BEEN GENERATED BEFORE CONTINUING
                break;
            else if (!Contains(randomNumber, generatedNumbers)) //CHECKS IF THE NUMBER HAS ALREADY BEEN GENERATED
            {
                //IF NOT, ADD THE NUMBER TO THE ARRAY, MOVE OVER ONE SPOT, AND INCREMENT THE RUN COUNT
                generatedNumbers[index] = randomNumber;
                index++;
                runs++;
            }
            else //IF THE NUMBER EXISTS IN THE ARRAY, DO NOTHING BUT INCREMENT THE RUN COUNTER
            {
                runs++;
            }
        }
        return runs;
    }

    public static int GetAverage(int sampleSize) //AVERAGES THE AMOUNT OF TRIES IN EACH RUN
    {
        int average = 0;
        for (int i = 0; i < sampleSize; i++)
        {
            average += RunTest();
        }

        return average / sampleSize;
    }

    public static boolean Contains(int number, int[] array) //CHECKS IF A VALUE EXISTS IN AN ARRAY
    {
        boolean contains = false;
        for(int temp : array)
        {
            if (number == temp)
                contains = true;
        }

        return contains;
    }

    public static boolean IsFull (int[] array) //CHECKS IF EVERY VALUE IN AN INT ARRAY IS USED
    {
        boolean isFull = true;
        for (int temp : array)
        {
            if (temp == 0)
                isFull = false;
        }
        return isFull;
    }
}

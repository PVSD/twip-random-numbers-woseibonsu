package com.company;

import static com.company.RandomNumbers.GetAverage; //I DON'T GET WHY IT IS MAKING ME IMPORT MY OWN METHOD WTJ

public class Main {

    public static void main(String[] args) {

        //DATA
        System.out.println("|DATA|");
        System.out.println("AVERAGE FOR 100: " + GetAverage(100));
        System.out.println("AVERAGE FOR 1000: " + GetAverage(1000));
        System.out.println("AVERAGE FOR 10000: " + GetAverage(10000));

        //CONCLUSION
        System.out.println("\n|EXPLANATION|");
        System.out.println(
                "The data gathered shows a negative correlation between the amount of times a loop is run and difference in averages.\n" +
                        "As we increase the sample size in this test the spread of results decreases because more data improves the data's accuracy.\n" +
                        "A larger sample size means there is larger access information, thus reducing uncertainty."
        );
    }

}

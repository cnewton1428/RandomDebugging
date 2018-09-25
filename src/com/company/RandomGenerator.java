package com.company;

import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {

        Random rnd = new Random();

        output("Generate 10 random integers between 1 and 6");

        for (int i = 1; i <= 10; i++)
        {
            int randomInt = 1 + rnd.nextInt(6);
            output("Generated number: " + randomInt);
        }
        output("Done");
    }

    public static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
    }


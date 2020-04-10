package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num, fact=1;

        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO FIND FACTORIAL");
        num = in.nextInt();
         if(num==0) {
             fact = 1;
         }
        for (int i = 2; i <= num; i++)
        {
            fact *= i;

        }
        System.out.println("FACTORIAL: "+ fact );
        System.out.println("FACTORIAL FROM RECURSION : "+factorial(num));


    }


//RECURSIVE ALGORITHM

    public static int factorial(int n)
    {
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }

}


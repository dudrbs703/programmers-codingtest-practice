/*
 * 
 * 피보나치 수
 *
 * 
*/

import java.util.*;

public class FibonacciNumber
 {

    public static void main(String[] args) 
    {
        //int n = 3;
        int n = 5;
        System.out.print(solution(n));
    }

    public static int solution(int n)
    {

        int []array = new int[n+1];
        array[0] = array[1] = array[2] = 1;

  
        for(int i=3; i<=array.length-1; i++)
        {
            array[i] = (array[i-1] + array[i-2]) % 1234567;
        }

        return array[n];

        /*
        if(n == 1 || n == 2)
        {
            return 1;
        } else return solution(n-1) + solution(n-2);
        */
    }
}



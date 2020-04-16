/*
 *
 * 문제명 : 정수 제곱근 판별
 *
 * 
*/

import java.util.*;

public class JudgeIntegerSquareRoot
{
    public static void main(String[] args) 
    {
       //long n = 3;
       int n = 121;

       System.out.println(solution(n));
    }

    public static long solution(long n)
    {
    
        int sqrt = (int)Math.sqrt(n);
        double sqrtNumber = Math.sqrt(n);
        
        if(sqrtNumber == sqrt )return (long)Math.pow(sqrtNumber+1, 2);
        else return -1;
        

     
    }

}

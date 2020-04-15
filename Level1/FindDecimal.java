/*
 * 소수 찾기
 *
 * 
*/

import java.util.*;

public class FindDecimal
{
    public static void main(String[] args) 
    {
       int n = 10;
       //int n = 5;
       System.out.println("갯수 : " + solution(n));

    }

    public static int solution(int n)
    {
        int answer = 0;
        int []decimal = new int[n+1];

        for(int i=0; i<decimal.length; i++)
        {
            decimal[i] = i;
        }

        for(int i=2; i<decimal.length; i++)
        {
            for(int j=i*2; j<decimal.length; j+=i)
            {
                if(decimal[j] == 0) continue;
                else if(decimal[j] != 0) decimal[j] = 0;
                
            }

            if(decimal[i] != 0) answer++;
        }

        return answer;
    }

}


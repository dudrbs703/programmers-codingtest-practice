/*
 *두 정수 사이의 합
 *
 * 
*/

import java.util.*;

public class BetweenAAndBofSum
{
    public static void main(String[] args) 
    {
        int a = 3, b = 5;
        //int a = 3, b = 3;
        //int a = 5, b = 3;
       System.out.println(solution(a, b));
    }

    public static long solution(int a, int b)
    {
        long answer = 0;

        if( a == b)
        {
            return a;
        } else if(a > b) {
            for(int i=b; i<=a; i++)
            {
                answer+=i;
            }
        } else {
            for(int i=a; i<=b; i++)
            {
                answer+=i;
            }
        }
        
        return answer;
        
    }

}

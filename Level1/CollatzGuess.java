/*
 *
 * 문제명 : 콜라츠 추측
 *
 * 
*/

import java.util.*;

public class CollatzGuess
{
    public static void main(String[] args) 
    {
       //int n = 6;
       //int n = 16;
       long n = 626331;

       System.out.println(solution(n));
    }

    public static int solution(long n)
    {
        int answer = 0;
        long tmp = n;

        int count = 0;
        while(true)
        {
            if(tmp == 1)
            {
                return answer;
            }

            if( count >= 500)
            {
                return -1;
            }
            
            if(tmp%2 == 0)
            {
                tmp /= 2;
                answer++;
                
            } else {
                tmp *=3;
                tmp++;  
                answer++;
            }

            //System.out.print(count+" ");
            count++;
        }

    }

}

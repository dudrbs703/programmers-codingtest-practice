/*
 *
 * 문제명 : 자릿수 더하기
 * 
*/

import java.util.*;

public class PositionalNumberSum
{
    public static void main(String[] args) 
    {
        int n = 123;
        //int n = 987;
        
       System.out.println(solution(n));
    }

    public static int solution(int n)
    {
        int answer = 0;

        char[] c = String.valueOf(n).toCharArray();

        for(int i =0; i<c.length; i++)
        {
            answer += Integer.parseInt(String.valueOf(c[i]));
        }

        return answer;
    }

}

public class PositionalNumberSum {

}
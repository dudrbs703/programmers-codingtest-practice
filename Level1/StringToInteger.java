/*
 * 문자열을 정수로 바꾸기
 *
 * 
*/

import java.util.*;

public class StringToInteger
{
    public static void main(String[] args) 
    {
        //String s = "1234";
        String s = "-1234";
        System.out.println(solution(s));
    }

    public static int solution(String s)
    {
        int answer = 0;

        answer = Integer.parseInt(s);
       
        return answer;

    }

}


/*
 * 문자열 다루기 기본
 *
 * 
*/

import java.util.*;

public class StandardStringHandling
{
    public static void main(String[] args) 
    {
       //String s = "a234";
       String s = "1234";

       System.out.println(solution(s));
    }

    public static boolean solution(String s)
    {
        boolean answer = false;

        if(s.length() == 4 || s.length() == 6)
        {
            for(int i=0; i<s.length(); i++)
            {
                //System.out.println((int)s.charAt(i));
            
                if((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57)
                {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }
            }
        } else return false;
        
        
        return answer;
    }

}

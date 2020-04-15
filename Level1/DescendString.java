/*
 * 문자열 내림차순으로 배치하기
 *
 * 
*/

import java.util.*;

public class DescendString
{
    public static void main(String[] args) 
    {
        String s = "Zbcdefg";

        System.out.println(solution(s));
    }

    public static String solution(String s)
    {
        if(s.length() < 1)
        {
            return null;
        }

        String answer ="";
        
        for(int i=0; i<c.length; i++)
        {
            for(int j=i+1; j<c.length; j++)
            {
                if(c[i] < c[j])
                {
                    char ch = c[i];
                    c[i] = c[j];
                    c[j] = ch;
                }
                
            }
        }     
      
        return String.valueOf(c);
    }

}


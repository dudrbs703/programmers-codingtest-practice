/*
 * 문자열 내 p와 y의 개수
 *
 * 
*/

import java.util.*;

public class CountStringPY
{
    public static void main(String[] args) 
    {
        //String s = "pPoooyY";
        String s = "Pyy";

        System.out.println(solution(s));
    }

    public static boolean solution(String s)
    {
        int p = 0;
        int y = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') p++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') y++;
        }

        return  p == y ? true : false;
    }

}


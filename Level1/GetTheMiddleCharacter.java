/*
 * 가운데 글자 가져오기
 *
 * 
*/

import java.util.*;

public class GetTheMiddleCharacter
{
    public static void main(String[] args) 
    {

        String s = "abcde";
        //String s = "qwer";
        System.out.print(solution(s));
    }

    public static String solution(String s)
    {

        String answer = "";
   
        if(s.length() % 2 == 0)
        {
            for(int i = s.length()/2; i<=(s.length()/2)+1; i++)
            {
                System.out.println(i);
                
                answer += String.valueOf(s.charAt(i-1));
            }
        } else return String.valueOf(s.charAt(s.length()/2));
      
        return answer;
        
    }

}

/*
 * 시저 암호
 *
 * 
*/

import java.util.*;

public class CaesarCipher
{
    public static void main(String[] args) 
    {
       //String s = "AB"; int n = 1;
       //String s = "z"; int n = 1;
       String s = "a B z"; int n = 4;


      
       System.out.println(solution(s, n));
    }

    public static String solution(String s, int n)
    {
        
        String answer ="";
        int NUMBER_OF_ALPHABAT = 26;

        char[]c = s.toCharArray();
    
        for(char ch : c)
        {
            if(ch == ' ') {
                answer+=ch;
                continue;
            }

            if(Character.isLowerCase(ch))
            {

                ch = (char)((ch - 'a' + n) % NUMBER_OF_ALPHABAT +'a');
            }
            
            if(Character.isUpperCase(ch))
            {
                
                ch = (char)((ch - 'A'+ n) % NUMBER_OF_ALPHABAT +'A');
            }

            answer+=ch;
        }

        return answer;
    }

}


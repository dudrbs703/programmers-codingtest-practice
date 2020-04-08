/*
 *
 * 문제명 : 이상한 문자 만들기
 *
 * 
*/

import java.util.*;

public class ConvertStrangeCharactor
{
    public static void main(String[] args) 
    {
       String s = "try hello world";
       solution(s);
       //System.out.println(solution(s));
    }

    public static void solution(String s)
    {
        String answer ="";
        String []tmp = s.split(" ", -1); //s.toCharArray();

        //split(" ", -1)
        // "abc " 일 경우 "AbC "로 뒤에 공백포함하여 반환해야하는데 
        // split(" ") 하면 값이 없는 C뒷부분공백은 제거되어 "AbC"로 반환됩니다.
        // 공백포함하려면 split(String regex, int limit) limit 인자를 0보다 작게 지정해야해요

        StringBuilder builder = new StringBuilder();


        for (String value : tmp)
        {
            for (int j = 0; j < value.length(); j++)
            {
                if (j % 2 == 0)
                {
                    builder.append(Character.toUpperCase(value.charAt(j)));

                } else builder.append(Character.toLowerCase(value.charAt(j)));

            }
            builder.append(" ");
        }

        answer = builder.toString().substring(0, builder.length()-1);
        System.out.print(answer);
    }

}

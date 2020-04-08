/*
 *
 * 문제명 : 핸드폰 번호 가리기
 *
 * 
*/

import java.util.*;

public class MaskingPhoneNumber
{
    public static void main(String[] args) 
    {
       //String phone_number = "01033334444";
       String phone_number = "027778888";

       System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number)
    {
        char []tmp = phone_number.toCharArray();

        int startPosition = tmp.length - 4;

        for(int i=0; i<startPosition; i++)
        {
            tmp[i] = '*';
        }

        return String.valueOf(tmp);
    }

}

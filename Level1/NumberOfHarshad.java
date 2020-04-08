/*
 *
 * 문제명 : 하샤드 수
 *
 * 
*/

import java.util.*;

public class NumberOfHarshad
{
    public static void main(String[] args) 
    {
       int arr = 10;
       //int arr = 12;
       //int arr = 11;
       //int arr = 13;

       System.out.println(solution(arr));
    }

    public static boolean solution(int x)
    {

        char []tmp = String.valueOf(x).toCharArray();
        int num=0;

        for(int i=0; i<tmp.length; i++)
        {
            num+=Integer.parseInt(String.valueOf(tmp[i]));
        }

        if((x % num) == 0)
        {
            return true;
        }

        return false;
    }

}

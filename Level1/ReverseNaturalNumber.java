/*
 *
 * 문제명 : 자연수 뒤집어 배열로 만들기
 *
 * 
*/

import java.util.*;

public class ReverseNaturalNumber
{
    public static void main(String[] args) 
    {
       long n = 12345;

       for(int l : solution(n))
       {
           System.out.println(l);
       }
    }

    public static int[] solution(long n)
    {
        int []answer={};

        //int tmp = Math.toIntExact(n);
        char c[] = String.valueOf(n).toCharArray();
        answer = new int[c.length];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<c.length; i++)
        {
            stack.push(Character.getNumericValue(c[i]));
        }
        for(int i=0; i<answer.length; i++)
        {
            answer[i] = stack.pop();
        }

        return answer;
    }

}

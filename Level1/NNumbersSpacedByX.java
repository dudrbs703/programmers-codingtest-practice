/*
 *
 * 문제명 : x만큼 간격이 있는 n개의 숫자
 * 
 * 문제 설명 : 함수 solution은 정수 x와 자연수 n을 입력 받아,
 *          x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
 *          다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 * 
*/

import java.util.*;

public class NNumbersSpacedByX
{
    public static void main(String[] args) 
    {
       int x = 2, n = 5;
       //int x = 4, n = 3;
       //nt x = -4, n = 2;

       for(long tmp : solution(x, n))
       {
           System.out.print(tmp+" ");
       }
    }

    public static long[] solution(int x, int n)
    {
        long []answer = new long[n];

        answer[0] = x;
        for(int i=1; i<answer.length; i++)
        {
            answer[i] =  answer[i-1] + x;
            
        }
      return answer;
    }

}

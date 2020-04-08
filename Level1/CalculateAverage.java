/*
 *
 * 문제명 : 평균 구하기
 *
 * 
*/

import java.util.*;

public class CalculateAverage
{
    public static void main(String[] args) 
    {
        int []arr = {1,2,3,4};
        //int []arr = {5,5};

        System.out.println(solution(arr));
    }

    public static double solution(int []arr)
    {
        double answer = 0;
        int i;

        for(i =0; i<arr.length; i++)
        {
            answer+=arr[i];
        }
      
      return answer/i;
    }

}

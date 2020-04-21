/*
 * 
 * H-Index
 *
 * 
*/

import java.util.*;

public class H_Index
 {

    public static void main(String[] args) 
    {
        int[] citations = {3, 0, 6, 1, 5};
        
        System.out.print(solution(citations));
    }

    public static int solution(int []citations)
    {
        int answer = 0;
        
        if(citations.length == 0)
        {
            return 1;
        }
        
        for(int i=0;i<citations.length-1; i++)
        {
           for(int j=i;j<citations.length; j++)
           {
               if(citations[i]<citations[j])
               {
                   int tmp = citations[i];
                   citations[i] = citations[j];
                   citations[j] = tmp;
               }
           }
       }

       for(int i=0; i<citations.length; i++)
        {
            if(citations[i] <= i)
            {
                break;
            } else answer++;
        }

        return answer;
    }
}



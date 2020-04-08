/*
 *
 * 문제명 : 제일 작은 수 제거하기
 *
 * 
*/

import java.util.*;

public class RemoveMinimumNumber
{
    public static void main(String[] args) 
    {
       int []arr = {4,3,2,1};
       //int []arr = {10};
       
       for(int i:solution(arr))
       {
           System.out.print(i + " ");
       }
    }

    public static int[] solution(int []arr)
    {
        if(arr.length == 1)
        {
            return new int[]{-1};
        }

        Queue<Integer> queue = new LinkedList<>();
        int tmp = arr[0];
        int position = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<=tmp)
            {
                tmp = arr[i];
                //position = i;
            }
            queue.offer(arr[i]);
        }

        queue.remove(tmp);
   
        int []answer = new int[arr.length-1];

        while(!queue.isEmpty())
        {
            answer[position++] = queue.poll();
        }

        return answer;
    }

}

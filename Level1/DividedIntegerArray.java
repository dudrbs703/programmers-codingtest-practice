/*
 * 나누어 떨어지는 숫자 배열
 *
 * 
*/

import java.util.*;

public class DividedIntegerArray
{
    public static void main(String[] args) 
    {
       //int []arr = {5,9,7,10}; int divisor = 5;
       //int []arr = {2,36,1,3}; int divisor = 1;
       int []arr = {3,2,6}; int divisor = 10;

       for(int i : solution(arr, divisor))
       {
           System.out.print(i+", ");
       }

    }

    public static int[] solution(int []arr, int divisor)
    {
        
        Arrays.sort(arr);
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] % divisor == 0)
            {
                //System.out.println(arr[i]);
                queue.offer(arr[i]);
            }
        }

        System.out.println(queue.size());

        int answer[];
        int position = 0;

        if(queue.isEmpty())
        {

            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        answer = new int[queue.size()];
        while(!queue.isEmpty())
        {
            answer[position++] = queue.poll();
        }
        

       

       

        return answer;

    }

}


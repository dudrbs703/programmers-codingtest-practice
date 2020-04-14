/*
 * 같은 숫자는 싫어
 *
 * 
*/

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class HateSameNumber
{
    public static void main(String[] args) 
    {
        int []arr = {1,1,3,3,0,1,1};
        //int []arr = {4,4,4,3,3};
  
        for(int i : solution(arr))
        {
            System.out.println(i);
        }
    }

    public static int[] solution(int []arr)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] != stack.peek())
            {
                stack.push(arr[i]);
            }
        }

        Deque<Integer> queue = new LinkedBlockingDeque<>();

        while(!stack.isEmpty())
        {
            queue.offer(stack.pop());
        }

        
        int []answer = new int[queue.size()];
        for(int i=0; i<answer.length; i++)
        {
            answer[i] = queue.pollLast();
        }
        
        return answer;
        
    }

}

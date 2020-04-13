/*
 * 정수 내림차순으로 배치하기
 *
 * 
*/

import java.util.*;

public class DescendNumber
{
    public static void main(String[] args) 
    {
       long n =118372;

        System.out.println(solution(n));
    }

    public static long solution(long n)
    {
        long answer = 0;

        char[] tmp = String.valueOf(n).toCharArray();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(char s : tmp)
        {
            queue.offer(Integer.valueOf(String.valueOf(s)));
        }

        StringBuilder builder = new StringBuilder();

        while(!queue.isEmpty())
        {
            builder.append(queue.poll());
        }

        answer = Long.valueOf(builder.toString());
        

        //tmp = queue.toArray();

        //return Long.valueOf(tmp);

        return answer;
    }

}

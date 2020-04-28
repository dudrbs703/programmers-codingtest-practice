/*
 * 
 * 더 맵게
 *
 * 
*/

import java.util.*;

public class MoreSpicy
 {

    public static void main(String[] args) 
    {
        int []scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.print(solution(scoville, k));
        
    }

    public static int solution(int []scoville, int k)
    {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i : scoville) queue.offer(i);

        int notspicy = 0; //안 매운거
        int spicy = 0; // 안매운거 보다 매운거

        while(!queue.isEmpty())
        {
            if(queue.peek() > k)
            {
                return answer;
            } else if(queue.size() == 1) return -1;

            notspicy = queue.poll();
            spicy = queue.poll();
            queue.offer(notspicy+(spicy*2));
            answer++;
        }

        return answer;
    }
}



import java.util.Collections;
import java.util.PriorityQueue;

/**
 * MinValue
 */
public class MinValue
{

    public static void main(String[] args) {
        //int []A = {1, 4, 2};
        // int []B = {5, 4, 4};

        int []A = {1, 2};
        int []B = {3, 4};

        System.out.println(solution(A, B));
    }

    public static int solution(int []A, int []B)
    {
        PriorityQueue<Integer> queueA = new PriorityQueue<>();
        PriorityQueue<Integer> queueB = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : A) queueA.offer(i);
        for(int i : B) queueB.offer(i);

        int answer = 0;
        while (!queueA.isEmpty() && !queueB.isEmpty()) 
        {
            answer = answer + (queueA.poll() * queueB.poll());
        }

        return answer;
    }

   
}
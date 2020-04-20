import java.util.*;

public class MockTest
{

    public static void main(String[] args) 
    {
         //int []answers = {1,2,3,4,5};
         int []answers = {1,3,2,4,2};

         for(int i : solution(answers))
         {
             System.out.println(i);
         }
    }

    public static int[] solution(int []answers)
    {
        
        int []students = new int[3];

        int []student_1 = {1, 2, 3, 4, 5};
        int []student_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int []student_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i=0; i<answers.length; i++)
        {
            if(answers[i] == student_1[i%student_1.length])
            {    
                students[0]++;
            }

            if(answers[i] == student_2[i%student_2.length])
            {    
                students[1]++;
            }

            if(answers[i] == student_3[i%student_3.length])
            {    
                students[2]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();


        int tmp = students[0];
        for(int i=0; i<students.length;i++)
        {
            if(tmp < students[i])
            {
                tmp = students[i];
            }
        }

        for(int i=0; i<students.length;i++)
        {
            if(tmp == students[i])
            {
                queue.offer(i+1);
            }
        }

        int position = 0;
        int []answer = new int[queue.size()];
        while(!queue.isEmpty())
        {
            answer[position++] = queue.poll();   
        }

        return answer;
    }
    
}
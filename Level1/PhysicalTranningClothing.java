/*
 * 
 * 체육복
 *
 * 
*/

import java.util.*;

public class PhysicalTranningClothing
 {

    public static void main(String[] args) 
    {
        //int n = 5; int []lost = {2, 4}; int []reverse = { 1, 3, 5};
        //int n = 5; int []lost = {2, 4}; int []reverse = {3};
        int n = 3; int []lost = {3}; int []reverse = {1};
        System.out.print(solution(n, lost, reverse));
    }

    public static int solution(int n, int []lost, int []reverse)
    {

        if(reverse.length <= 1)
        {
            return 1;
        }

        int answer = reverse.length;

        int []student = new int[n];
        Arrays.fill(student, 1);
        
        for(int i=0; i<lost.length; i++)
        {
            for(int j=0; j<student.length; j++)
            {
                if(lost[i]-- == student[j])
                {
                    student[j] = 0;
                }
            }
        }



        for(int i:student) System.out.println(i);

        return answer;
    }
}



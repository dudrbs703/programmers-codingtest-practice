/*
 * 문자열 내림차순으로 배치하기
 *
 * 
*/

import java.util.*;

public class DescendString
{
    public static void main(String[] args) 
    {
        String s = "Zbcdefg";

        System.out.println(solution(s));
    }

    public static String solution(String s)
    {
        String answer ="";

        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            stack.push(String.valueOf(s.charAt(i)));
        }

        while(!stack.isEmpty())
        {
            queue.offer(stack.pop());
        }

        String tmp = "";

        

        while(true)
        {
            while(!queue.isEmpty())
            {
                tmp = queue.poll();
                System.out.print(tmp);
                if((int)tmp.charAt(0)>= 97 && (int)tmp.charAt(0) <=122)
                {
                    answer+=tmp;
                } 
            }

            while(!queue.isEmpty())
            {
                answer+=queue.poll();
            }
            break;
        }

       
        System.out.println();
       
       

        return answer;
    }

}


/*
 * 
 * 프린터
 *
 * 
*/

import java.util.*;

class InnerPrinter {
    int priority;
    int location;

    InnerPrinter(int priority, int location)
    {
        this.priority = priority;
        this.location = location;
    }

    /**
     * @return the location
     */
    public int getLocation() {
        return location;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }
}


public class Printer
 {

    public static void main(String[] args) 
    {
        //int []priorities = {2, 1, 3, 2}; int location = 2;
        int []priorities = {1, 1, 9, 1, 1, 1}; int location = 0;
        //int []priorities = {1,2,3}; int location = 0;

        System.out.println(solution(priorities, location));

    }

    public static int solution(int[] priorities, int location)
    {
        int answer = 1;       
        
        PriorityQueue<Integer>queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : priorities) queue.offer(i);        

        while(!queue.isEmpty()) 
        {
            for(int i=0;i<priorities.length;i++)
             {
                if(queue.peek().equals(priorities[i]))
                {
                    if(i == location) return answer;
                    queue.poll();
                    answer++;
                }
            }
        }
        return answer;
        
    

        /*
        int idx_highPriority = 0;
        int highPriority = 0;
        Queue<InnerPrinter> printers = new LinkedList<>();
        for(int i=0; i<priorities.length; i++)
        {
            if(highPriority < priorities[i])
            {
                idx_highPriority = i;
                highPriority =priorities[i];
            }
            
            printers.offer(new InnerPrinter(priorities[i], i));
        }

        InnerPrinter printer;
        for(int i=0; i<idx_highPriority; i++)
        {
            printer = printers.poll();
            printers.offer(printer);
        }

        int position = 0;
        while (!printers.isEmpty())
        {
            printer = printers.poll();
           // System.out.println(printer.priority+"  "+printer.getLocation());
            if(printer.getLocation() == location)
            {
                answer = position;
                break;
            }

            position++;
            
        }*/

        //return answer;
    }
}



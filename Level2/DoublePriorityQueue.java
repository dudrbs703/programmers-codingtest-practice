/*
 * 
 * 이중우선순위큐
 *
 * 
*/

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

import sun.awt.www.content.audio.basic;


public class DoublePriorityQueue
 {

    public static void main(String[] args) 
    {
        //String []operations ={"I 16","D 1"};
        //String []operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        //String []operations = {"I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6"};
        String []operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        //String []operations = {"I 7","I 5","I -5","D -1"};
        //String []operations = {"I 4","I 3","I 2","I 1"};
        for(int i : solution(operations))
        {
            System.out.print(i + " ");
        }
    }

    public static int []solution(String []operations)
    {

        /*
            I 숫자 : 큐에 숫자 삽입
            D 1 : 큐에서 최대값 삭제
            D -1 : 큐에서 최소값 삭제
        */
        int []answer = new int[2];
        
        PriorityQueue<Integer> queueMin = new PriorityQueue<>();
        PriorityQueue<Integer> queueMax = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        Deque<Integer> deque = new LinkedBlockingDeque<>();


        String []tmp;
        /*
        for(int i=0; i<operations.length; i++)
        {
            tmp = operations[i].split(" ");

            if(tmp[0].equals("I"))
            {
                System.out.println("입력 Min : "+tmp[1] +"   입력 Max : "+tmp[1]);
                queueMin.offer(Integer.parseInt(tmp[1]));
                queueMax.offer(Integer.parseInt(tmp[1]));
                continue;
            }

            if(tmp[0].equals("D") && tmp[1].equals("-1"))
            {
                //최소
                System.out.println("출력 Min: "+queueMin.peek());
                queueMin.poll();
                continue;

            }
            if(tmp[0].equals("D") && tmp[1].equals("1"))
            {
                //최대
                System.out.println("출력 Max: "+queueMax.peek());
                queueMax.poll();
                continue;
            } else if(queueMin.isEmpty() || queueMax.isEmpty() && tmp[0].equals("D")){
                continue;

            } else return answer;
        }

    
        if(queueMin.isEmpty() || queueMin.size() <= 1)
        {
            answer[0] = 0;
            answer[1] = 0;
        } else {

            if(queueMax.peek() < queueMin.peek())
            {
                answer[0] = queueMin.poll();
                answer[1] = queueMax.poll();
            } else {
                answer[0] = queueMax.poll();
                answer[1] = queueMin.poll();
            }
            
        }*/


        //Deque
        
        for(int i=0; i<operations.length; i++)
        {
            tmp = operations[i].split(" ");

            if(tmp[0].equals("I"))
            {
                //System.out.println("입력 "+tmp[1]);
                deque.offer(Integer.parseInt(tmp[1]));
                System.out.println(deque.peekFirst());

                while (!deque.isEmpty()) queue.offer(deque.poll());
                deque.clear();
                while (!queue.isEmpty()) deque.offer(queue.poll());
                continue;
            }

            
            if(tmp[0].equals("D") && tmp[1].equals("-1"))
            {
                //최소
                //System.out.println("출력 "+queueMin.peek());
                deque.pollLast();
                
                continue;

            }
            if(tmp[0].equals("D") && tmp[1].equals("1"))
            {
                //최대
                //System.out.println("출력 "+queueMax.peek());
                deque.pollFirst();
                continue;
            } else if(deque.isEmpty() && tmp[0].equals("D")){
                continue;

            } else return answer;
            
        }

        if(deque.isEmpty() || deque.size() <= 1)
        {
            answer[0] = 0;
            answer[1] = 0;
        } else {

            if(deque.peekFirst() > deque.peekLast()) 
            {
                
                answer[0] = deque.pollFirst();
                answer[1] = deque.pollLast();
            } else {
                answer[0] = deque.pollLast();
                answer[1] = deque.pollFirst();
            }
        }

        /*
        int n=0;
        while(!deque.isEmpty())
        {
            n = deque.poll();
            queueMax.offer(n);
            queueMin.offer(n);
        }

        
        if(deque.isEmpty() || deque.size() <= 1)
        {
            answer[0] = 0;
            answer[1] = 0;
        } else {

            if(deque.peekFirst() > deque.peekLast()) 
            {
                answer[0] = deque.pollFirst();
                answer[1] = deque.pollLast();
            } else {
                answer[0] = deque.pollLast();
                answer[1] = deque.pollFirst();
            }
        }*/


        return answer;
    }

   
}



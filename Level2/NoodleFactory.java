/*
 * 
 * 라면 공장
 *
 * 
*/

import java.util.*;

class InnerStock implements Comparable<InnerStock>
{
    private int date;
    private int stock;

    InnerStock(int date, int stock)
    {
        this.date = date;
        this.stock = stock;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    @Override
    public int compareTo(InnerStock o) {
        return o.getStock() < getStock() ? 1 : -1;
    }
}

public class NoodleFactory
 {

    public static void main(String[] args) 
    {
        int stock = 4; int[] dates = {4,10,15}; int[] supplies ={20,5,10}; int k = 30;
        //int stock = 4; int[] dates = {1,2,3,4}; int[] supplies ={10,40,30,20};int k = 100;
        //int stock = 5; int[] dates = {1,2,3,4,5}; int[] supplies ={1,1,1,1,25};int k = 30;
        //int stock = 1; int[] dates = {1,2,3,4,5}; int[] supplies ={1,1,1,1,25};int k = 30;

        System.out.print(solution(stock, dates, supplies, k));
    }

    public static int solution(int stock, int[] dates, int[] supplies, int k)
    {
        int answer = 0;

        PriorityQueue<InnerStock> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<dates.length; i++)
        {
            queue.offer(new InnerStock(dates[i], supplies[i]));
        }
        
        for(int i=0; i<k; i++)
        {
            System.out.print(i+"일 : ");
            
            if(stock == 0)
            {
                stock += queue.poll().getStock();
                stock--;
                answer++;
                System.out.println(stock+" ");
                continue;
            } 

            System.out.println(stock);
            stock--;
            
        }

        return answer;
    }
}



/*
 * 
 * 탑
 *
 * 
*/

import java.util.*;

class InnerTop
{
    private int idx;
    private int height;

    InnerTop(int idx, int height)
    {
        this.idx = idx;
        this.height = height;
    }

    /**
     * @return the idx
     */

    public int getIdx()
    {
        return idx;
    } 

    /**
     * @return the height
     */
    public int getHeight()
    {
        return height;
    }
}

public class Top
{

    public static void main(String[] args) 
    {

        //int []heights = {6, 9, 5, 7, 4};    
        //int []heights = {3, 9, 9, 3, 5, 7 ,2};    
        int []heights = {1, 5, 3, 6, 7, 6, 5};

        for(int i : solution(heights))
        {
            System.out.print(i + " ");
        }
    }

    public static int[]solution(int []heights)
    {

        //제출한 코드
        /*
         int answer[] = new int[heights.length];

        for(int i=heights.length-1; i>=0; i--)
        {
            System.out.print(i +" : ");
            for(int j=i-1; j>=0; j--)
            {

                if(heights[i]<heights[j])
                {
                    answer[i] = j+1;
                    //System.out.print(j +" ");
                    break;
                }

                if(j==0) answer[i] = 0;
            }
            //System.out.println();
        }        

        return answer;
        */


        // 수정한 코드
        int []answer = new int[heights.length];

        Stack<InnerTop> stack = new Stack<>();
        Stack<InnerTop> tmp = new Stack<>();

        for(int i=0; i<heights.length; i++)
        {
           stack.push(new InnerTop(i+1, heights[i]));
        }

        InnerTop top = null;
        for(int i=heights.length-1; i>=0; i--)
        { 
            //System.out.print(i + " ");
            
            top = stack.pop();
            while(true)
            {
                while(!stack.isEmpty())
                {
                    if(top.getHeight() < stack.peek().getHeight())
                    {
                        answer[i] = stack.peek().getIdx();
                        break;
                    }
                    //System.out.print(stack.peek().getHeight()+" ");
                    tmp.push(stack.pop());
                }

                while(!tmp.isEmpty())
                {
                    stack.push(tmp.pop());
                }
                
                break;        
           
            }  
        }
        return answer;
    }
}
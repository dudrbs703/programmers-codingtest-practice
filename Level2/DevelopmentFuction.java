import java.util.*;
import java.util.stream.Stream;


class InnerProgress
{
    private int progress;
    private int speed;
    private int idx;
    private int day;

    InnerProgress(int idx, int progress, int speed)
    {
        this.idx = idx;
        this.progress = progress;
        this.speed = speed;
        this.day = 0;
    }

    /**
     * @return the progress
     */
    public int getProgress() {
        return progress;
    }

    public boolean isCompleted()
    {
        if(progress >= 100)
        {
            return true;
        } else return false;
    }

    public void process()
    {
        if(progress <= 100)
        {
            progress+=speed;
            day++;
        }
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the idx
     */
    public int getIdx() {
        return idx;
    }
}

public class DevelopmentFuction {

    public static void main(String[] args) {
        int []progresses = {93,30,55};
        int []speeds = {1,30,5};

        for(int i : solution(progresses, speeds))
        {
            //System.out.print(i + " ");
        }
    
    }

    public static int[] solution(int []progresses, int []speeds)
    {
        int answer[] = new int[0];
      
        Queue<InnerProgress> queue = new LinkedList<>();
        Queue<Integer> completed = new LinkedList<>();

        for(int i=0; i<progresses.length; i++)
        {
            queue.offer(new InnerProgress(i, progresses[i], speeds[i]));
        }        

        InnerProgress progress = null;
        int currentPosition = 0;

        while(!queue.isEmpty())
        {
            progress = queue.poll();
            if(progress.getIdx() != currentPosition)
            {
                
                progress.process();
                queue.offer(progress);

            } else if(progress.getIdx() == currentPosition && progress.isCompleted()) {
                System.out.println(progress.getProgress());
                currentPosition++;
                continue;
            }
        }
       

        /*
    
        currentPosition = 0
        answer = new int[competed.size()];
        while(!queue.isEmpty())
        {
            answer[currentPosition++] = completed.poll();
        }*/

/*
        
        while(!queue.isEmpty())
        {
            progress = queue.poll();
            if(!progress.isCompleted())
            {
                progress.process();
                queue.offer(progress);
            } else if(progress.isCompleted() && currentPosition == progress.getIdx()) {
                completed.offer();
                currentPosition++;

            } else {
                queue.offer(progress);
            }
        }*/


        /*
        for(int i=0; i<10; i++)
        {
            System.out.print(i +" 일차|");
            for(int j=0; j<progresses.length; j++)
            {
                
                System.out.print(progresses[j]+" ");
                if(progresses[j] >= 100){
                    continue;
                } 
                else progresses[j] += speeds[j];
            }
            System.out.println();
        }*/

        return answer;
    }

}
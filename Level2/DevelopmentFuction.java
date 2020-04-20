import java.util.*;

public class DevelopmentFuction {

    public static void main(String[] args) {
        int []progresses = {93,30,55};
        int []speeds = {1,30,5};

        for(int i : solution(progresses, speeds))
        {
            System.out.print(i + " ");
        }
    
    }

    public static int[] solution(int []progresses, int []speeds)
    {
        int answer[] = new int[0];
        int tmp = new int[3];

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
        }

        return answer;
    }

}
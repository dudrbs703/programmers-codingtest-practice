import java.util.LinkedList;
import java.util.Queue;

/**
 * DayOfTheWeek
 */
public class DayOfTheWeek
 {

    public static void main(String[] args) 
    {
        int a = 5, b = 24;

        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b)
    {
        String answer = "";

        String []weeks = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int []months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Queue<MyDate> queue = new LinkedList<>();

        int weekPositition = 5;

        for(int i=1; i<=months.length; i++)
        {
            //System.out.print(i +"월 ");
            for(int j=1; j<=months[i-1]; j++)
            {
                //System.out.print(j +" ");
                if(weekPositition >= 7) weekPositition = 0;
                queue.offer(new MyDate(i, j, weeks[weekPositition++]));
            }
            //System.out.println();
            
        }

        MyDate date = null;
        while(!queue.isEmpty())
        {
            date = queue.poll();
            if(date.getMonth() == a && date.getDAY_OF_THE_WEEK() == b) answer = date.getDAY_OF_THE_WEEK();
            else continue;
            //System.out.println(date.month +" "+date.day+" "+date.DAY_OF_THE_WEEK);
        }
    
        return answer;
    }
}

class MyDate
{
    private String DAY_OF_THE_WEEK;
    private int month;
    private int day;

    MyDate(int month, int day, String DAY_OF_THE_WEEK)
    {
        this.month = month;
        this.day = day;
        this.DAY_OF_THE_WEEK = DAY_OF_THE_WEEK;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the dAY_OF_THE_WEEK
     */
    public String getDAY_OF_THE_WEEK() {
        return DAY_OF_THE_WEEK;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }
}

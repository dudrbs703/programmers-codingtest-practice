import java.util.PriorityQueue;

/**
 * MaxMinValue
 */
public class MaxMinValue {

    public static void main(String[] args) {
        //String s = "1 2 3 4";
        //String s = "-1 -2 -3 -4";
        String s = "-1 -1";

        System.out.println(solution(s));
    }

    public static String solution(String s)
    {
        String []stringArray = s.split(" ");
        int []tmp = new int[stringArray.length];

        for(int i=0; i<stringArray.length; i++)
        {
            tmp[i] = Integer.parseInt(stringArray[i]);
        }

        int min = tmp[0];
        int max = tmp[0];
        for(int i=1; i<tmp.length; i++)
        {
            if(tmp[i] > max){
                max = tmp[i]; 
                // System.out.println(max);
            } 
            else if(min > tmp[i]){
                min = tmp[i];
                // System.out.println(min);
            } 
        }
        return new String(String.valueOf(min) +" "+ String.valueOf(max));
    }
}
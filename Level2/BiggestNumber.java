/*
 * 
 * 가장 큰 수
 *
 * 
*/

import java.util.*;

public class BiggestNumber
 {

    public static void main(String[] args) 
    {

        //int []numbers = {6, 10 , 2};
        int []numbers = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers));
    }

    public static String solution(int []numbers)
    {
        String[] arr = new String[numbers.length];
    
        for (int i = 0; i < numbers.length; i++) arr[i] = String.valueOf(numbers[i]);
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(arr[0].equals("0")) return "0";
         
        StringBuilder builder = new StringBuilder();
        for (String s : arr) builder.append(s);
 
        return builder.toString();        
    }

   
}



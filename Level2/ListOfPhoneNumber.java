/*
 * 
 * 전화번호 목록
 *
 * 
*/

import java.util.*;
import java.util.Map.Entry;

public class ListOfPhoneNumber
 {

    public static void main(String[] args) 
    {
        String []phone_book = {"119", "97674223", "1195524421"};
        //String []phone_book = {"123","456","789"};
        //String []phone_book = {"12","123","1235","567","88"};
        //String []phone_book = {"119", "1192456"};
        System.out.println(solution(phone_book));
    }

    public static boolean solution(String []phone_book)
    {
        boolean answer = true;
        
        /*
        String prefix = phone_book[0];
        
        Map<String, String> map = new HashMap<>();
        for(int i=1; i<phone_book.length; i++) map.put(phone_book[i], "phone");

        for(Entry<String, String> entry : map.entrySet())
        {
            if(entry.getKey().contains(prefix)) return false;
        }*/

        /*
        for(int i=0; i<phone_book.length-1;i++)
        {
            for(int j=i+1; j<phone_book.length; j++)
            {
                if(phone_book[i].startsWith(phone_book[j]))
                { 
                    System.out.println(i+" 1 "+phone_book[i]+" "+phone_book[j]);
                    return false;
                };
                if(phone_book[j].startsWith(phone_book[i])){
                    System.out.println(i+" 2 "+phone_book[i]+" "+phone_book[j]);
                    return false;
                } 
            }
            

        } 

        */


        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1; i++)
        {
            if(phone_book[i+1].startsWith(phone_book[i]))
            {
                answer = false;
                break;
            }
        }
        return answer;
    }
}



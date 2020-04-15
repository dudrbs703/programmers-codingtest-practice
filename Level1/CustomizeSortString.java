/*
 * 문자열 내 마음대로 정렬하기
 *
 * 
*/

import java.util.*;


public class CustomizeSortString
{
    public static void main(String[] args) 
    {
        //String strings[] = {"sun", "bed", "car"}; int n = 1;
        String strings[] = {"abce", "abcd", "cdx"}; int n = 2; 
    
        for(String s : solution(strings, n))
        {
            System.out.print(s+" ");
        }
    }

    public static String[] solution(String []strings, int n)
    {

        Arrays.sort(strings, new Comparator<String>() 
        {
            @Override
            public int compare(String s1, String s2) 
            {
                char a = s1.charAt(n);
                char b = s2.charAt(n);
                System.out.println(s1 +" : "+ a +"   " + s2 +" : "+ b);

                if(a==b) return s1.compareTo(s2);
                return a-b;
            }
        });
        /*
        for(int i=0; i<strings.length; i++)
        {
            for(int j=i+1; j<strings.length; j++)
            {
                
                if(strings[i].length() == strings[j].length())
                {
                    if(strings[i].charAt(n) > strings[j].charAt(n))
                    {
                        String tmp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = tmp;

                    } else if(strings[i].charAt(n) == strings[i].charAt(n) && strings[i].charAt(n+1) > strings[j].charAt(n+1)) {
                        String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                    }
                    
                    
                } else if(strings[i].length() < strings[j].length()){
                    String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
               
                
            }
        }*/

        return strings;
    }

}


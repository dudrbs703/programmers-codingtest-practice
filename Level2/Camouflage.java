/*
 * 
 * 위장
 *
 * 
*/

import java.util.*;

public class Camouflage
 {

    public static void main(String[] args) 
    {
        String [][]clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        //String [][]clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        
        System.out.println(solution(clothes));
    }

    public static int solution(String [][]clothes)
    {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++)
        {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) +1);
        }

    
        //int tmp = 0;
        if(map.size() <= 1)
        {
            //answer = 0;

            return map.entrySet().iterator().next().getValue();
/*
            for(Map.Entry<String, Integer> value : map.entrySet())
            {
                return value.getValue();
            }*/

        } else {

            for(int n : map.values())
            {
                //System.out.println(n);
                answer *= (n+1);
            }
            /*
            for(Map.Entry<String, Integer> value : map.entrySet())
            {
                tmp+=value.getValue();
            }
    
            for(int i=tmp; i>=1; i--)
            {
                answer*=i;
            }
    */
            answer-=1;
        }
        
       
        //System.out.println(x);

        
        

        return answer;
    }
}



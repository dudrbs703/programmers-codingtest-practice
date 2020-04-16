/*
 * 완주하지 못한 선수
 *
 * 
*/

import java.util.*;

public class UnfinishedPlayer
{
    public static void main(String[] args) 
    {
       //String []participant =  {"leo", "kiki", "eden"}; String []completion = {"eden", "kiki"};
       //String []participant = {"marina", "josipa", "nikola", "vinko", "filipa"}; String []completion = {"josipa", "filipa", "marina", "nikola"};
       String []participant = {"mislav", "stanko", "mislav", "ana"}; String []completion = {"stanko", "ana", "mislav"};
       System.out.println(solution(participant, completion));
    }

    public static String solution(String []participant, String []completion)
    {

        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);

        Map<String, Integer> hash = new HashMap<>();
        for(String s : participant) hash.put(s, hash.getOrDefault(s, 0)+1);
        for(String s : completion) hash.put(s, hash.get(s) -1);

        for(String key : hash.keySet())
        {
            if(!hash.get(key).equals(0)) answer = key;
        }

        return answer;
    }
}
import java.uitl.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * OpenChatRoom
 */
public class OpenChatRoom {

    public static void main(String[] args) {
        String []record = {
            "Enter uid1234 Muzi", 
            "Enter uid4567 Prodo",
            "Leave uid1234",
            "Enter uid1234 Prodo",
            "Change uid4567 Ryan"

            /*
                "Prodo님이 들어왔습니다."
                "Ryan님이 들어왔습니다."
                "Prodo님이 나갔습니다."
                "Prodo님이 들어왔습니다."
            */
        };

        record = solution(record);
        for(int i=0; i<record.length;i++)
        {
            //System.out.println(record[i]);
        }
    }
    static int position = 0;
    public static String[] solution(String []record)
    {
        int OPTION      = 0;
        int UID         = 1;
        int NICKNAME    = 2;
        
        String []tmpArray;
        Map<String, String> logs = new HashMap<>();
        ArrayList<String> message = new ArrayList<>();
        for(int i=0; i<record.length; i++)
        {
            tmpArray = record[i].split(" ");
            switch(tmpArray[OPTION])
            {
                case "Enter":
                logs.put(tmpArray[UID], tmpArray[NICKNAME]);
                message.add(tmpArray[UID]+"님이 들어왔습니다.");
                break;

                case "Leave":
                message.add(tmpArray[UID]+"님이 나갔습니다.");
                break;

                case "Change":
                logs.put(tmpArray[UID], tmpArray[NICKNAME]);
                break;
            }
        }

        String []answer = new String[message.size()];

        for(String s : message)
        {
            int endOfNickname   = s.indexOf("님");
            String nickname     = s.substring(0, endOfNickname);
            answer[position++]  = s.replace(nickname, logs.get(nickname)); 
        }
        
        return answer;
    }
}
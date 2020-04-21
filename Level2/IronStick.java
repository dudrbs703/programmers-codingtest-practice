import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * IronStick
 */
public class IronStick
 {
    public static void main(String[] args) 
    {
        
        String arrangement = "()(((()())(())()))(())";
        System.out.println(solution(arrangement));
    }

    public static int solution(String arrangement)
    {
        int answer = 0;

        Stack<Character> ironStack = new Stack<>();
        char []tmp  = arrangement.toCharArray();

        for(int i=0;i<tmp.length; i++)
        {
            if(tmp[i] == '(')
            {
                ironStack.push('(');
            } else if(tmp[i] == ')') {
                ironStack.pop();
                answer+=1;
            } else answer+=ironStack.size();
        }

        return answer;
    }
}
import java.util.Stack;

/**
 * CorrectBracket
 */
public class CorrectBracket
{

    public static void main(String[] args) 
    {
        // String s = "()()";
        // String s = "(())()";
        // String s = ")()(";
        // String s = "(()(";
        //String s = "())())";
        String s = "()))((()";
        System.out.println(solution(s));

    }

    public static boolean solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        if(s.charAt(0) == ')') return false;

        while(true)
        {
            for(int i=0; i<s.length(); i++)
            {
                switch(s.charAt(i))
                {
                    case '(':
                    stack.add(s.charAt(i));
                    break;

                    case ')':
                    if(s.charAt(i) == ')' && stack.isEmpty()) return false;
                    else stack.pop();
                    //if(stack.peek() == '(') stack.pop();
                    break;
                }
            }
            
            if(stack.isEmpty()) return true;
            else return false;
        }
    }
}
/*
 *
 * 문제명 : 행렬의 덧셈
 *
 * 문제 설명 : 
 * 함수 solution은 정수 x와 자연수 n을 입력 받아,
 * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 * 
*/

import java.util.*;

public class DartGame
{
    public static void main(String[] args) 
    {
        String dartResult = "1S2D*3T";
        //String dartResult = "1D2S#10S";
        //String dartResult = "1D2S0T";
        //String dartResult = "1S*2T*3S";
        //String dartResult = "1D#2S*3S";
        //String dartResult = "1T2D3D#";
        //String dartResult = "1D2S3T*";

        //System.out.println(solution(dartResult));
        System.out.println(13*-1);
    }

    public static int solultion(String dartString)
    {
        int answer = 0;

        char []tmp = dartString.toCharArray();
    
        for(int i=0; i<tmp.length; i++)
        {
            
            switch(tmp[i])
                {
                    case 'S':
                    break;

                    case 'D':
                    break;

                    case 'T':
                    break;

                    case '*':
                    break;

                    case '#':
                    break;

                }
        }

        return answer;
    }

}

/*
 *
 * 문제명 : 행렬의 덧셈
 *
 * 문제 설명 : 함수 solution은 정수 x와 자연수 n을 입력 받아,
 *          x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
 *          다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 * 
*/

import java.util.*;

public class MaxtrixOfSum
{
    public static void main(String[] args) 
    {
        int [][]arr1 ={{1,2},{2,3}};
        int [][]arr2 ={{3,4},{5,6}};
        //int [][] arr1 ={{1},{2}};
        //int [][]arr2 ={{3},{4}};

        int [][]tmp = solution(arr1, arr2);
        for(int i=0; i<tmp.length; i++)
        {
            for(int j=0; j<tmp.length; j++)
            {
                System.out.print("("+tmp[i][j]+")");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int [][]arr1, int arr2[][])
    {
        int row = Math.max(arr1.length, arr2.length);
        int col = Math.max(arr1[0].length,arr2[0].length);

        int answer[][] = new int[row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

}

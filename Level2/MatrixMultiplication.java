import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * MatrixMultiplication
 */
public class MatrixMultiplication {

    public static void main(String[] args) {
        
        int [][]arr1 = {
            {1, 4}, 
            {3, 2}, 
            {4, 1}
        };


        int [][]arr2 = {
            { 3, 3 }, 
            { 3, 3 }, 
        };

        /*
        int [][]arr1 = {
            { 2, 3, 2 }, 
            { 4, 2, 4 }, 
            { 3, 1, 4 }
        };

        int [][]arr2 = {
            { 5, 4, 3 }, 
            { 2, 4, 1 }, 
            { 3, 1, 1 }
        }; */

        solution(arr1, arr2);
    }

    public static void solution(int [][]arr1, int [][]arr2)
    {
        int [][]answer = new int[arr1.length][arr2[0].length];

        for(int i=0; i<answer.length; i++)
        {
            for(int j=0; j<arr1[0].length; j++)
            {
                for(int k=0; k<arr2[0].length; k++)
                {
                    answer[i][k]+= arr1[i][j] * arr2[j][k];
                }
            }
        }
        
        //return answer;

        try {
            for(int i=0; i<arr1.length; i++)
            {
                for(int j=0; j<arr1[0].length; j++)
                {
                    Thread.sleep(100);
                    System.out.print(answer[i][j] +" ");
                }
                System.out.println();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
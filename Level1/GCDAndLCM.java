/*
 * 최대공약수와 최소공배수
 *
 * 
*/

import java.util.*;

import org.graalvm.compiler.asm.sparc.SPARCAssembler.Br;

public class GCDAndLCM
{
    public static void main(String[] args) 
    {
       //int n = 3, m = 12;
       int n = 2, m = 5;
       solution(n, m);
    }

    public static void solution(int n, int m)
    {
        int []answer = new int[1];
        int []tmp = {n, m};

        int num1 = n;
        int num2 = m;

        int gcd=0;
        int lcm=0;
        for(int a : tmp)
        {
            System.out.print(a +" : ");
            for(int i=1; i<=a; i++)
            {
                //System.out.print(i +" ");
                if(a % i == 0 && gcd < i )
                {
                    gcd = i;
                    System.out.print(gcd+" ");
                }

            }

            gcd=0;
            
            System.out.println();
        }

        
    


        //System.out.println("최대공약수 : " + gcd);
        //System.out.println("최소공배수 : " + lcm);
        
    }

}

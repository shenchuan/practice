import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        Integer numTests = Integer.parseInt(scanner.nextLine());
        
        for(int i=0;i<numTests;i++)
        {
           String[] numArr = scanner.nextLine().split(" "); 
            
           int n = Integer.parseInt(numArr[0]);
           int k = Integer.parseInt(numArr[1]);   
           
           String[] arr = scanner.nextLine().split(" ");
           for (int j=0;j<n;j++)
           {
                if(Integer.parseInt(arr[j]) <= 0)
                    k--;
               
                if (k == 0) 
                {
                    System.out.println("NO");
                    break;
                }
               
                if (j == n-1)
                    System.out.println("YES");
           }
        }
        
    }
}

import java.util.*;

public class zoho
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int strLength = input.length();
        int middle = strLength / 2;

        String finalString = input.subString(middle,strLength);
        finalString.concat(input.subString(0,middle));

        System.out.println(finalString);


        int i, j, row = strLength;  
        for (i=0; i<row; i++)   
        {  
            for (j=2*(row-i); j>=0; j--)         
            {  

            System.out.print(" ");   
            }   
            for (j=0; j<=i; j++ )   
            {   
                System.out.print(finalString.charAt(i)+" ");   
            }   
            System.out.println();   
        }  
    }
}
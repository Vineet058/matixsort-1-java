// Sorting matrix using sort function.
// This code is developed at BlueJ software.

//          1 4 2 3     ->     1 2 3 4 
//          5 9 7 6     ->     5 6 7 9
//          7 3 4 8     ->     3 4 7 8
//          4 2 3 8     ->     2 3 4 8

import java.util.*;
import java.util.Arrays;
class matrixsort
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int a[][]=new int[4][4];
        int i,j;
        System.out.print("Enter 16 Number : ");
        for (i=0;i<4;i++)
        {
            for (j=0;j<4;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        
        for (i=0;i<4;i++)
        {
            for (j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        for (i=0;i<a.length;i++)
        {
            Arrays.sort(a[i]);
        }

        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
class DDa
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int N[][]=new int[4][4];
        int r,c;
        int odd=0,even=0;
        System.out.println("Enter the values for the matrix");
        for (r=0;r<4;r++)
        {
            for(c=0;c<4;c++)
            {
                N[r][c]=sc.nextInt();
            }
        }
        for(r=0;r<4;r++)
        {
            for(c=0;c<4;c++)
            {
               if (N[r][c]%2!=0)
               {
                   odd+=N[r][c];
               }
               else
               {
                   even+=N[r][c];
               }
            }
        }
        for(r=0;r<4;r++)
        {
            for(c=0;c<4;c++)
            {
                System.out.print(N[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("The Sum of the odd Numbers is="+odd);
        System.out.println("The Sum of the even Numbers is="+even);
    }
}
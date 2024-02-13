import java.util.*;
class SDA_Qna3
{
    static void main()
    {   //input
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        System.out.println("Enter 10 no.s");
        for (int i=0;i<10;i++)
        n[i]=sc.nextInt();
        for (int i=0;i<10;i++)
        {
          for (int j=0;j<10;j++)  
          {
              if (n[j]<0)
              System.out.println(n[j]+",");
          }
        }
    }
}
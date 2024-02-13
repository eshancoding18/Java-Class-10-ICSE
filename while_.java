import java.util.*;
class while_
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int d,n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.println("The digits are:");
        while(n>0)
        {
            d=n%10;
            System.out.println(d);
            n=n/10;
        }
    }
}
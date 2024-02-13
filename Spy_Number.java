/* Creating Spy Number*/
import java.util.Scanner;
class Spy_Number
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the spy number:");
        int spy=sc.nextInt();
        int sum=0,product=1;
        while(spy>0)
        {
            spy%=10;
            sum+=spy;
            product*=spy;
            spy/=10;
        }
        if (sum==product)
        {
            System.out.println("It is the spy number");
            System.out.println("Sum of the spy number is:"+sum);
            System.out.println("Product of the spy number:"+product);
        }
        else
        {
            System.out.println("It is not the spy number:");
        }
    }
}
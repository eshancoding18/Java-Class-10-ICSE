/* Define a class calculate to accept two numbers as
 * Instance variables
 */
import java.util.*;
class Page_384_q1
{
    int a,b;
    private void inputdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    private void calculate()
    {
        a+=b;
        b-=a;
        b=Math.abs(b);
    }
    private void outputdata()
    {
        System.out.println("The Sum of the two numbers Are:"+a);
        System.out.println("The Difference between two numbers is:"+b);
    }
    static void main()
    {
        Page_384_q1 ob=new Page_384_q1();
        ob.inputdata();
        ob.calculate();
        ob.outputdata();
    }
}
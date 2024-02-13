/* Display a Class Triplet with following specifications
 * 
 */
import java.util.*;
class Triplet
{
    int a,b,c;
    private void getdata()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
    }
    private void findprint()
    {
        a=b*b+c*c;
        
    }
}
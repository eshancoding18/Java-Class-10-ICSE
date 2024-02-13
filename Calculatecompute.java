import java.util.Scanner;
class Calculatecompute{
    int a,b,c,d;
    private void inputdata(){
        Scanner sc=new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
    private void calculate(){
        c=a+b;
        d=a-b;
    }
    private void outputdata(){
        System.out.println("The Sum is:"+c);
        System.out.println("the Difference is:"+d);
    }
    static void main(){
        Calculatecompute sum=new Calculatecompute();
        sum.inputdata();
        sum.calculate();
        sum.outputdata();
    }
}
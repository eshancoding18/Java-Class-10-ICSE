import java.util.Scanner;
class udmq1{
    static void Accept(){
        //declaration'
        Scanner sc=new Scanner(System.in);
        int l,b;
        //input
        System.out.println("Enter Length and Breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        //Calculation
        double area=calculateArea(l,b);
        System.out.println("The Area is:"+area);
    }
    private static double calculateArea(int l,int b){
        return l*b;
    }
}
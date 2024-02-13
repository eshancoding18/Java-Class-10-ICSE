import java.util.*;
class pronic{
    static void Accept(){
        //declaration
        Scanner sc=new Scanner(System.in);
        int Num;
        //input
        System.out.println("enter A positive integer");
        Num=Math.abs(sc.nextInt());
        //output
        if (Num==1)
        System.out.println("It is a Pronic number");
        else 
        System.out.println("Not a Pronic number");
    }
    //method ends
    private int pronic(int n){
        for(int m=0;m<=n/2;m++){
            if (m*(m+1)==n)
            return 1;
        }
        return 0;
    }
    }

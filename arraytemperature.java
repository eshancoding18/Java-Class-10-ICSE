import java.util.Scanner;
class arraytemperature{
    static void main(){
        int f,i;
        double temp[]=new double[20];
        Scanner sc=new Scanner (System.in);
        for( i=0;i<20;i++){
            temp[i]=sc.nextDouble();
        }
        //process
        double c;
        for(i=0;i<20;i++){
            c=(temp[i]-32.0)*5.0/9.0;
            System.out.println("The temperatures are: \t"+c);
        }
    }
}
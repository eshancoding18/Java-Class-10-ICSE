import java.util.Scanner;

//To display 20 different numbers
class arrays1{
    static void main(){
        Scanner sc=new Scanner(System.in);
        int i,o=0,e=0;
        int m[]=new int[20];
        for(i=0;i<20;i++){
            System.out.println("Enter the number in the cell");
            m[i]=sc.nextInt();
        }
        for (i=0;i<20;i++){
            if(m[i]%2==0)
            e+=m[i];
            else
            o+=m[i];
        }
        System.out.println("The Sum of the Even Numbers Are \t"+e);
        System.out.println("The Sum of the Odd Numbers Are \t"+o);
    }
}//am, ar, eu, bn, en-GB, pt-BR, bg, ca, chr, hr, cs, da, nl, en, et, fil, fi, fr, de, el, gu, iw, hi, hu, is, id, it, ja, kn, ko, lv, lt, ms, ml, mr, no, pl, pt-PT, ro, ru, sr, zh-CN, sk, sl, es, sw, sv, ta, te, zh-TW, tr, ur, uk, vi, cy
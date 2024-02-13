import java.util.Scanner;
//am, ar, eu, bn, en-GB, pt-BR, bg, ca, chr, hr, cs, da, nl, en, et, fil, fi, fr, de, el, gu, iw, hi, hu, is, id, it, ja, kn, ko, lv, lt, ms, ml, mr, no, pl, pt-PT, ro, ru, sr, zh-CN, sk, sl, es, sw, sv, ta, te, zh-TW, tr, ur, uk, vi, cy
class Selection_Sort
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter the "+(i+1)+" th Number: ");
            m[i]=sc.nextInt();
        }
        for(int i=0;i<10-1;i++)
        {
            int index=i;
            for(int j=i;j<10;j++)
            {
                if(m[j]<m[index])
                {
                 index=j;//Searching For Lowest Index   
                }
        }
            int SmallerNumber=m[index];
            m[index]=m[i];
            m[i]=SmallerNumber;
        }
        System.out.print("Enter The Number To Be Searched: ");
         int n=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(m[i]==n)
            n=i;
        }
        System.out.print("The Index Number Of the Number Searched is: "+n);
    }
}
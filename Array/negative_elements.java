import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,temp,j=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
            a[i]=scan.nextInt();
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        for(i=0;i<n;i++)
        {
            if(a[i]<0 && i!=j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        System.out.println();
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
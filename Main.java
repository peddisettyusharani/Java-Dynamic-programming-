import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  number:");
        int n=sc.nextInt();
        Main obj=new Main();
        int result=obj.factorial(n);
        System.out.println("factorial of a number "+n+" is "+result);


    }
    int factorial(int n)
    {
        if (n==0||n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
import java.util.Scanner;
public class ClimbingSteps
{
    public static int climb(int n)
    {
        if(n==1)
        {
            return (n);
        }
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total number of steps:");
        int n=sc.nextInt();
        System.out.println("number of outcomes are :"+climb(n));
    }
}

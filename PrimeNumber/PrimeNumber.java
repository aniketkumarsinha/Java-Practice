public class PrimeNumber {
    public static void main(String args[]) {
        int n=38, flag=0;
        int m=n/2;
        if (n==0 || n==1)
        {
            System.out.println(n + " is not a prime number.");
        }
        else
        {        
        for(int i=2; i<=m; i++)
        {
            if(n%i == 0)
            {
                System.out.println(n + " is not a prime number.");
                flag++;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println(n + " is a prime number.");
        }
        }
        
    }
}
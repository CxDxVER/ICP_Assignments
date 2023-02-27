import java.util.Scanner;
class Q8 {
    public static void main (String args []) {
        Scanner sc=new scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        double sum=0;
        for(double i=1;i<=n;i++) {
            double ans=1/(i*i);
            sum=sum+ans;
        }
        System.out.println(sum);
    }
}
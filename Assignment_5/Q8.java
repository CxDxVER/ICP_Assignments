import java.util.Scanner;
class Q8 {
    public static void main (String args []) {
        Scanner sc=new scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=n;i>=1;i++) {
            for(int j=i;j>=1;j++) {
                sum=sum+j;
            }
            System.out.println(sum);
        }
    }
}
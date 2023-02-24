import java.util.Scanner;
public class Q4 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer between 0 to 1000:");
		int n=sc.nextInt();
		int i, s=0;
        for(i=1;i<=3;i++) {
            s+=(n%10);
            n=n/10;
        }
		System.out.println("ThE Sum of the Digits= "+s);
	}
}
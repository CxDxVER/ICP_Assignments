import java.util.Scanner;
class Q2 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		int n=0,s=0;
		System.out.println("Enter an Integer");int x=sc.nextInt();
		while(n>0) {
			n=n%10;
			s=s+n;
			n=n/10;}
		if (s%9==0)
			System.out.println("The Number is divisible by 9");
		else
			System.out.println(":)");
	}
}
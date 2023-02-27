import java.util.Scanner;
class Q4 {
	public static void main(String args []) {
	Scanner sc=new Scanner(System.in);
    
	System.out.println("Enter the 1ST  Number");
	int a=sc.nextInt();
	System.out.println("Enter the 2ND  Number");
	int b=sc.nextInt();
	int r;
	System.out.println("GCD of "+a+" and "+b+" is");
	do { 
		r=a%b;a=b;b=r;
	}
	while(r!=0);
		System.out.print(a);
	}
}
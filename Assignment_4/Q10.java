import java.util.Scanner;
class Q10{
	public static void main(String args []) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int a=sc.nextInt();int n=1;
		while(n<=a) {
			n=n*3;
	} 
		int v=n/3;
		System.out.println("The largest power of 3 less than or equal to "+a+" is "+v);
	}
}
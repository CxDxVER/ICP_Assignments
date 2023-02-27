import java.util.Scanner;
public class Q9{

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n= sc.nextInt();
	int a=0,c,i=0;
	while(n!=0) {
		c=n%10;
		if(c!=0) {
			a+= c*(int)(Math.pow(10, i));
			i++;}
		n=n/10;
	}
	System.out.println("After removing all zeros: "+a);
	}
}
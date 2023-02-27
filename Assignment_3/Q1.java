import java.util.Scanner;
class Q1 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter person's Age: ");
		int a=sc.nextInt();
		if (a<18)
			System.out.println("Come after you're 18.. xD");
		else 
			System.out.println("You are eligible to cast your vote. :)");
	}
}
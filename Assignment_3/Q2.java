import java.util.Scanner;
class Q2 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter quantity of water in ml: ");
		int a=sc.nextInt();
		
        if (a>=5000)
			System.out.println("Yes, Alice is following doctor's Advice. :)");
		else 
			System.out.println("No, Alice is not following doctor's Advice. :(");
	}
}
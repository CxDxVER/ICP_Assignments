import java.util.Scanner;
class Q3 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Input 1st Number: ");
        double a=sc.nextDouble();
		
        System.out.println("Input 2nd Number: ");
        double b=sc.nextDouble();
		
        System.out.println("Input 3rd Number: ");
        double c=sc.nextDouble();
		
		if(a<b && b<c)
			System.out.println("Increasing");
		else
			System.out.println("Decreasing");
	}
}
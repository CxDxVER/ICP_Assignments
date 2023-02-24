import java.util.Scanner;
class Q5 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter radius:");
		double r=sc.nextDouble();
		
		double SA=3*Math.PI*r*r;
		double V=(2.0/3)*Math.PI*r*r*r;
		
		System.out.println("The Surface Area of Hemisphere is: "+SA);
		System.out.println("Volume of Hemisphere is: "+V);
	}
}
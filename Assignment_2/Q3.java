import java.util.Scanner;
class Q3 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
        double DA=0,HRA=0,GS=0;

		System.out.print("Enter Basic Salary:");
		double BS=sc.nextDouble();

		DA=BS*40/100;
		HRA=BS*20/100;
		GS= BS+DA+HRA;
		
		System.out.println("Dearness Allowance is: "+DA);
		System.out.println("House Rent Allowance is: "+HRA);
		System.out.println("Gross Salary is: "+GS);
	}
}
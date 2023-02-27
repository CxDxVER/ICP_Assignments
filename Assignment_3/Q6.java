import java.util.Scanner;
class Q6 {
	public static void main(String args) {
		Scanner sc=new Scanner(System.in);
		double p=0;
		System.out.println("Enter a Number of Units: ");
		double u=sc.nextDouble();
		if (u<=50)
			p=u*3.0;
		else if(u<=200) 
			p=50*3.0+(u-50)*4.80;
		else if(u<=400)
			p=50*3.0+200*4.80+(u-200)*5.80;
		else
			p=50*3.0+200*4.80+400*5.80+(u-400)*6.20;
		
		System.out.println("Monthly Electricity Bill= "+p);	
	}
}
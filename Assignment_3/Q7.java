import java.util.Scanner;
class Q7 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		double p=0,d=0,a=0;
		System.out.println("Enter a Number of Units: ");
		double u=sc.nextDouble();
		System.out.println("Do you want to pay online (y/n): ");
		String s=sc.next();
		String y="y";String n="n";
		if(s.equals(y)) {
			if (u<=50)
				p=u*3.0;
			else if(u<=200) 
				p=50*3.0+(u-50)*4.80;
			else if(u<=400)
				p=50*3.0+150*4.80+(u-200)*5.80;
			else
				p=50*3.0+150*4.80+200*5.80+(u-400)*6.20;
			
			d=3.0/100*u;
			a=p+d;
			System.out.println("No. of Units Consumed: ");
			System.out.println("Total Amount: "+p);
			System.out.println("Discount: "+d);
			System.out.println("Amount Payable: "+a);
		}
		else if(s.equals(n)) {
			if (u<=50)
				p=u*3.0;
			else if(u<=200) 
				p=50*3.0+(u-50)*4.80;
			else if(u<=400)
				p=50*3.0+150*4.80+(u-200)*5.80;
			else
				p=50*3.0+150*4.80+200*5.80+(u-400)*6.20;
			
			System.out.println("Total Amount: "+p);
		}	
	}
}
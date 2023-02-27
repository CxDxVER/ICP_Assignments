import java.util.Scanner;
class Q8 {
	public static void main(String args []) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of X"); double x= sc.nextDouble();
		System.out.println("Enter the value of Y"); double y= sc.nextDouble();
		
		if (x>0.0 && y>0.0)
			System.out.println("1st Quadrant");
		else if (x>0.0 && y<0.0)
			System.out.println("2nd Quadrant");
		else if (x<0.0 && y<0.0)
			System.out.println("3rd Quadrant");
		else if (x<0.0 && y<0.0)
			System.out.println("4th Quadrant");
		else if (x==0.0 && y<0.0)
			System.out.println("On the Y-axis");
		else if (x<0.0 &&y==0.0)
			System.out.println("On the X-axis");
		else
			System.out.println("On the Origin");
		}
	}

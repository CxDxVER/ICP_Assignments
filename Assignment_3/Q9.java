import java.util.Scanner;
class Q9 {
	public static void main(String args []) {
		Scanner sc=new Scanner (System.in);
		double max, min, seclarge;
		System.out.println("Enter 3 Integers"); double x= sc.nextDouble(); double y= sc.nextDouble(); double z= sc.nextDouble();
		
		if (x>y && x>z){
			max=(int)x;
			System.out.println("Max Number= "+max);}
		else if (y>x && y>z){
			max=(int)y;
			System.out.println("Max Number= "+max);}
		else{
			max=(int)z;
			System.out.println("Max Number= "+max);}
		
		if (x<y && x<z){
			min=(int)x;
			System.out.println("Min Number= "+min);}
		else if (y<x && y<z){
			min=(int)y;
			System.out.println("Min Number= "+min);}
		else{
			min=(int)z;
			System.out.println("Min Number= "+min);}
		
		seclarge= (x+y+z)/(max+min);
		System.out.println("2nd Largest= "+seclarge);
		
		}
	}

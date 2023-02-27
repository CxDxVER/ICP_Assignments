import java.util.Scanner;
class Q1 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the first number");int x=sc.nextInt();
		System.out.println("enter the second number");int y=sc.nextInt();
		System.out.println("enter the third  number");int z=sc.nextInt();
		int s=0;

		for(int i=x;i<=y;i=i+z){
		    System.out.print(i+" ");
			s=s+i;}
		System.out.println();
		System.out.println("the sum of number displayed= "+s);
	}
}
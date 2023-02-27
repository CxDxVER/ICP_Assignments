import java.util.Scanner;
class Q6 {
	public static void main(String args []) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the base");
        int x=sc.nextInt();
		System.out.println("Enter the power ");
        int y=sc.nextInt();
		
		long r=1;
        while(y!=0) {
            r=r*x;
            --y;
        }
        System.out.println("Answer: "+r);
	}	
}
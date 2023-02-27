import java.util.Scanner;
class Q4 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter 1st number");
        int x=sc.nextInt();
		System.out.println("Enter 2nd  number");
        int y=sc.nextInt();

		long f=1;
		if(x<y && x>0 && y>0) {
			for(long i=x;i<=y;i++) {
				f=f*i;
				System.out.println("Factorial of "+i+" "+"is:"+f);
			}
		}
		else
			System.out.println("rip");
	}
}
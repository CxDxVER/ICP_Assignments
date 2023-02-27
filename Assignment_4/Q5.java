import java.util.Scanner;
class Q5 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number");
		long N= sc.nextLong();int i=1, S=0;
		
		while(i<=N/2) {
			if (N%i==0) {
				S=S+i;
			} i++; 
		}
		if (S==N)
			System.out.println(N+" is a perfect number");
		else 
			System.out.println(N+" is not perfect number");
	}
}
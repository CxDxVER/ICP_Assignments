import java.util.Scanner;
class Q5 {
	public static void main(String args []) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter 1st number");
        int m=sc.nextInt();
		System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        
		for(int i=m;i<=n;i++) {
			System.out.println("Multiplication table of "+i);
			for(int j=1;i<=10;j++){
				System.out.println(i+"x"+j+"="+(n*j) );}
		}
	}
}
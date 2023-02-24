import java.util.Scanner;
class Q7 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter :");
		int a=sc.nextInt();

		System.out.println("a\tb\tpow(a,b)");
		
        for(a=1; a<6;a++) {
			int b=a+1;
			int c=(int)Math.pow(a, b);
			System.out.println(a+"\t"+b+"\t"+c);
		}
	}
}
import java.util.Scanner;
class Q3 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter a number");
        int max=sc.nextInt();
		int min=1, s=0,c=0;
		System.out.println("Random numbers are");
		do {
			int r=min+(int)(Math.random()*9);
			System.out.print(r+" ");
			s=s+r;
			c+=1;
		} while(c<max);
		System.out.println("\n average is "+(s/max));
	}
}